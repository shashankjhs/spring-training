This demonstration uses openfeign, Eureka, API Gateway

Dynamically assigning port is good for scaling up and scaling down, But for accessing from client we must a consistent fixed URL
To solve this problem, we use API gateway

API gateway use to route request from clients to microservices
Also microservices communication should be routed via api gateway.
We will be just exposing port and ip of api gateway to client application.
If we want to run common code for all MS, we will be writing in API gateway(logging, authorization, authentication)
API gateway also used as load balancer


Steps for API gateway-
- create new Spring Boot project
- Add appropiate dependencies (EurekaDiscoveryClient & Gateway)
- Add properties to Application.properties


