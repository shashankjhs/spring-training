package com.walmart.api.coupon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.api.coupon.model.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Integer>{
	
	public Coupon findByCouponCode(String couponCode) ;
	

}
