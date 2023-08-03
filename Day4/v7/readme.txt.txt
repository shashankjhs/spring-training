This Demostration uses Openfiegn, Api-Gatway, SpringCloud LoadBalancer, Resilience4J, Slueth, Zipkin

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
