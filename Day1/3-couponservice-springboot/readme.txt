Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.walmart.api.coupon.dao.CouponDao' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1175)
	at com.walmart.api.coupon.Application.main(Application.java:20)

Above exception occurs when we are asking for specific bean which not present in container

In order to register classes as spring bean, we must be annotating then with Stereotype annotation based on the role they are performing


Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.walmart.api.coupon.dao.CouponDao' available: expected single matching bean but found 2: couponDaoImpl,couponJPADaoImpl
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveNamedBean(DefaultListableBeanFactory.java:1273)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveBean(DefaultListableBeanFactory.java:494)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:349)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1175)
	at com.walmart.api.coupon.Application.main(Application.java:20)
	
The cause of above exception is we have 2 types of bean and we are trying to get 1.
In order to resolve the issue, we ahve to use bean id
Every bean in pring container haas unique id associated with it. this id can beused to get that bean specifically