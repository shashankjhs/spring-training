package com.walmart.api.coupon.dao.impl;

import org.springframework.stereotype.Repository;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

@Repository
public class CouponDaoImpl implements CouponDao{
	
	public Coupon saveCoupon(Coupon coupon) {
		// this method should talk to DB and insert record in the DB
		System.out.println("Coupon inserted in db within JDBC");
		return coupon;
		
	}

}
