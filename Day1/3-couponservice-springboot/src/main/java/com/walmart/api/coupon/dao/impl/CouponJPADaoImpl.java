package com.walmart.api.coupon.dao.impl;

import org.springframework.stereotype.Repository;


import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

@Repository // this annotation is used on top of DAo classes, Hence DAO classes also referred as repository classes
public class CouponJPADaoImpl implements CouponDao{
	public Coupon saveCoupon(Coupon coupon) {
		System.out.println("Insert coupon Object to DB using JPA");
		return coupon;
	}

}
