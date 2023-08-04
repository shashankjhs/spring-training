package com.walmart.api.coupon.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.api.coupon.command.CreateCouponCommand;
import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

@RestController
public class CouponRestController {

	@Autowired
	private CouponDao couponDao;
	


	@PostMapping ("/api/coupon")
	public String createCoupon(@RequestBody Coupon c) {
		CreateCouponCommand command = new CreateCouponCommand();
		command.setId(c.getId());
		command.setCouponCode(c.getCouponCode())
		
	}
}
