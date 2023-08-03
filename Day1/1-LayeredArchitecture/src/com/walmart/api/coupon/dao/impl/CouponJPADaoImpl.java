package com.walmart.api.coupon.dao.impl;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

public class CouponJPADaoImpl implements CouponDao{
	public Coupon saveCoupon(Coupon coupon) {
		System.out.println("Insert coupon Object to DB using JPA");
		return coupon;
	}

}
