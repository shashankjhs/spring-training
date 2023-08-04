This Demostration uses Openfiegn, Api-Gatway, SpringCloud LoadBalancer, Resilience4J, Slueth,Secured Eureka, Config Server, Zipkin, Spring Cloud Bus

Eureka is very Important and essential applicaiotn in MS architecture, hence we have to take care of following 2 things:-
- Security of eureka - the idea is each MS trying to register itself must authenticate with Eureka first. If authentication is successful, then only Eureka allows MS to register itself.
- To avoid single point of failure, we must have cluster of eureka server 

Steps to make Euereka Secure :
- add security dependency in Eureka aplicaiotn(spring-)
- Add appropiate username & password
- write configuration class
- Each MS must be passing username and password while connecting to EUREKA