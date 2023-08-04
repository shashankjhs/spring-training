This Demostration uses Openfiegn, Api-Gatway, SpringCloud LoadBalancer, Resilience4J, Slueth,Eureka, Config Server, Zipkin, Spring Cloud Bus

In MS architecture there are lot of MS, each MS has it own config. Also we have different config for different Environments
Changing configs by visiting app.properties filr for that MS is practically impossible, Hence we would like to keep these config details
at central location and separate from each microservice
To exactly do this spring cloud offers Config Server
By Default config server is looking for git repo

Config server will take responsibility of reading the central config and exposing standard rest endpoints[http://localhost:8888/application/default]



Steps :
- crete new spring boot project
- add appropiate dependency
- enable config sever with @EnableConfigServer
- Add properties

Once config server is setup, we need to configure ms so that it will pick values from config server.
to do this, each MS mast as a client to config server

Steps to define config clients:
- add properties


Making any changes ot any configurations at central repository won't be picked up by MS, in order to those changes to reflect 
MS needs to restart

this is impratical and hence we want changes to picked up dynamiccally

-Add Actuator dependency in microservice
- Expose refresh endpoint using applicaiton.properties
- Annottate the class which uses this property with @RefreshScope 
- HIt post request request http://localhost:<port-of-microservice>/acutator/refresh


In the above approach changes would we picked up dynamically only by one specific MS, for which we are hitting refresh 
It is possible that there are config changes for multiple MS, In order to pick up those changes for all MS we have to hit post request to refresh endpoint for all MS individually
Exactly ot solve this prroblem, Spring cloud offers Spring CLoud Bus
So the idea is with just one endpoint, we should be able ot update config changes to all MS at once.
Spring cloud Bus links Microserves which are distributed with as message broker. This is done to broadcast config changes

Steps :
- Download and install, Message Broker(RabbitMQ)
- rabbitmq-plugins enable rabbitmq_management
- rabbitmq-server start

- Add Actuator dependency in spring cloud config server
- Add Spring Cloud starter BUS amqp dependency in config server and in each MS
- Add properties for RabbitMQ in the properties file in config server and each of the microservice(Writing these properties is optional if we are going for default config)
- Expose BUs refresh endpoints using application.properties(Configuration server)
- Hit Post request to http://localhost/config-server/actuator/busrefresh
- 

