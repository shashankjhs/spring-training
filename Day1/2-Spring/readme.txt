layered architecture is most common architecture. 
The idea is to divide the application into different 	components with similar functionalities
And these are grouped together under same name.
As a result, each layer perform a specific role
Example: DAO layer, service layer

Each class in Java must be in package
Package name should be reverse order of the domain we are working in.
com.walmart.api.coupon.dao.impl



COUPLING -
Degree to which one class/layer Knows about other

One layer should talk to other only via public interface of the other layer


Here we are creating object and hence Applicaiton class is tightly coupled with COuponJPADaoImpl
If you plan to switch to JDBC this line needs to be changed , which is classical example of tight coupling
In Java application  is is very common that two layers talking ot each other which leads to tight coupling issue
 To exactly solve this problem, SPRING was born
 
 Core principle of Spring is DI[Dependency Injection]
 We ask spring container to objects for our app, whcich then can be injected at runtime depending on the requirement
 Every object in th spring container is called as Bean, hence spring container is also called as Bean Container
 Once the Container is ready, we can ask for a specific bean type from container using getBean()
 
 Step to use spring :
 
 - Add appropriate dependency
 - Create configuration classes for specific module
 
 Though initially spring was written for dependency injection with time it has evolved and added many features but to use these features we have to do configurations
 And these configurations can be time consuming, error prone, repetitive
 
 Spring team has come up with spring Boot which take cares of automatic configurations whenever possible