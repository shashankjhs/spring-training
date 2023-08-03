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