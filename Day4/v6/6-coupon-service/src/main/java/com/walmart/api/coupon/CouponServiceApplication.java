package com.walmart.api.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.model.Coupon;

@SpringBootApplication
@EnableEurekaClient // this is optional but reccomended
public class CouponServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(CouponServiceApplication.class, args);
		
		
		
		
	}

}
