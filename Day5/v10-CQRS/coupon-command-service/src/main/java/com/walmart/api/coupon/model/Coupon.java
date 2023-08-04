package com.walmart.api.coupon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Coupon {
	
	private int id;
	private String couponCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	private int discount;

}
