import com.walmart.api.coupon.dao.CouponDao;
import com.walmart.api.coupon.dao.impl.CouponDaoImpl;
import com.walmart.api.coupon.dao.impl.CouponJPADaoImpl;
import com.walmart.api.coupon.model.Coupon;

public class CouponApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Coupon Applicaiton");
		Coupon coupon=new Coupon();
		coupon.setDiscount(100);
		coupon.setCouponCode("CI");
		coupon.setId(1);
//		CouponDaoImpl dao =new CouponDaoImpl();
		
		CouponDao couponDao = new CouponJPADaoImpl(); // Here we are creating object and hence Applicaiton class is tightly coupled with COuponJPADaoImpl
		//If you plan to switch to JDBC this line needs to be changed , which is classical example of tight coupling
		//In Java application  is is very common that two layers talking ot each other which leads to tight coupling issue
		// To exactly solve this problem, SPRING was born
		couponDao.saveCoupon(coupon);
		
		

	}

}
