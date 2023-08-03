This demostration uses openfeign, eureka server

Hardcoding of url in feign client is bad choice as it tightlly couples to 1 specific instance of miveroservice
Which means Scaling up and scaling down won't work.
in Microservice architecture it is very common to spin up multiple instance of a microservice if needed

To solve this problem we have design pattern, service discovery.
Each Microservice registers itself with service discovery with some unique name.
The client microservice can just use the logical name as it is registerted with discovery service to connect to that microservice.

One of the most populer and respected service discovery is Eureka from Netflix.

Steps to use Eureka server :
- create nre spring boot project.
- add appropiate dependency
- enable Eureka server by annotating application class with @EnableEurekaServer
- Change port to 8761(not mandated but recoomended)
- to test Eureka server is running with following url http://localhost:8761

NOte :- By default Euraka client registers themselves with unknown name


Steps for Eureka client
- Add appropiate dependency(eureka-discovery-client)
- Add a property in applicaiton.properties to give appropiate name to each microserviec
- Add a property to application.properties to specify url of eureka server
- Annotate applicaiton calss with @EnableEurekaClient (This is is optional step but reccomended)


It is very common to spin up multiple instances of multiple Microservice and to spin down also. Hence it is pratically impossible to keep track of the 
port number and change them manually by visiting app.properties.

To dynamically assign the unused ports, we have to follow steps given below
- In Applicaiton.properties we should port to ZERO
- byDefault , every instance has one ID associated with eureka, We need to make sure ID is unique for every instance, to do that, wehave to add
following properties in applicaiotn.peoperties file-
 erureka.instance.instnace-id=${spring.applicaiotn.name}:${random.value}