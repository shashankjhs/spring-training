Circuit Breaker: 
this pattern is used to prevent cascading failures because of N/W contectivity, timeout issue, Service unavailibity issue
Circuit is in three possible states
- OPEN - calls to remote MS is not allowed, this is bad state not desirable state
- CLOSED - calls to MS is allowed, this is dedirable & default state
- HALF-OPEN - In this state only few calls are allowed to remote MS

Steps:
- Add dependency (resilience4j)
- Add appropiate properties in App.properties
- Write a fallback method which returns some user friendly response to client
    - Signature of fallback method must match with the method for which fallback was written (method annotated with @circuitBreaker)
    - it must have one additional argument throwable

Because MS need to commuicate with each other via REST call, and REST call might fail it it possible for cascading failure.
In order to avoid this cascading failures. we must make sure that our system are resillient to these failures

Exactly to do this spring cloud offers a library known as reselience4j
(NOTE : In old version of cloud Hystrix was used)
(NOTE: In olad version of spring cloud for load balancing, ribbon was used from NETFLIX)
(NOTE: In olad version of spring cloud ZUUL was used instead of API gateway)

Resiliense4j has different module. Following are 2 important of them -
CircuitBreaker
Retry

The Sequence of how these modules are applied to these functions is predefined which resilience4J call it as aspect order
CircuitBreaker has greater aspest order (preference) than retry by default

NOTE : Configuration of these resilience4J modules can also be done through JAVA code.