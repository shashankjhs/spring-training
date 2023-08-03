package com.walmart.api.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.dao.impl.CouponDaoImpl;
import com.walmart.api.coupon.model.Coupon;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(Application.class, args);
		Coupon coupon=new Coupon();
		coupon.setDiscount(100);
		coupon.setCouponCode("CI");
		coupon.setId(1);
//		CouponDao couponDao =container.getBean("couponDaoImpl",CouponDao.class);
		CouponDao couponDao =container.getBean(CouponDao.class);
		couponDao.saveCoupon(coupon);
		
	}

}
