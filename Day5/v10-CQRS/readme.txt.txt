CQRS - Command Query Responsibility Segregation.

The idea is very simple. We should divide our applicaiotn into two parts -
1. Command - responsible for altering the state of an object.
2. Query - responsible for retriving the state of object


The idea is to have 2 independent separate applications with 2 independent separate databases.
 One which is finetuned for write operations and the second one for optimising the read operations. 
For eg - coupon-command-service, coupon-query-service


Command is con=mbination of intent (what wewant to be done) as well as the info required to do that action based on the intent

Naming convention for command is.
verb in imperative mode followed by entity we are dealing with followed bu "command" -> e.g CreateCouponCommand


Query -
Query express the desire of information.
naming convention-
Verb followed by entity we are dealing with followed by "query" -> E.g - FindCouponQuery

