package com.walmart.api.order.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.api.order.dao.OrderDao;
import com.walmart.api.order.feign.client.CouponServiceFeignClient;
import com.walmart.api.order.model.Order;
import com.walmart.api.order.rest.response.CouponResponse;

@RestController
public class OrderRestController {

	@Autowired
	private OrderDao orderDao;
	@Autowired
	private CouponServiceFeignClient feignClient;
	
	@PostMapping("/api/order")
	public Order placeOrder(@RequestBody Order order) {
		// Fetch couponOCde from order
		String couponCode= order.getCouponCode();
		
		// From CouponCode fetch applicable discount
		// to fetch discount we must call coupon service
		// this is rest call
		CouponResponse couponResponse = this.feignClient.findDiscountByCouponId(couponCode);
		
		int discount=couponResponse.getDiscount();
		System.out.println("discount "+ discount);
		// Apply that discount to order object
		order.setPrice(order.getPrice() - discount);
		
		//save order object to database
		orderDao.save(order);
		
		//return order object
		return order;
		
		
		
	}
}
