WebApplication is meant for human consumption
WebServices is meant for application consupmtion
The most common format of exchanging data is Json

To Create a web Service in Spring we need to follow below steps :
- Create as new class
- Annotate this class with @RestController
- Define methods in this class, Annotate respective methods with appropriate annotation
- Add Spring Starter web dependency


Monolithic Application:
- it is traditional way of building Application
- If all the funtionalities exist in a single code base then it is called monolithic Applicaiotn
- It is a big single code application
- It is deployed as a single unit

Drawback of monolithic App:
- It become too large in SIze with time
- Even for a small change we need to redeploy the whole application
- Scaling up and Scaling down is difficult with Monolithic
- It is very difficult to adapt new technology whcih is well suited for a particular functionality


In Order to overcome this problem we can divide our application into multiple samll indenpendent funtionalities based on business req

Such applicaiotn is acalled as microservices applicaiotn
Each microservice is developed and deployed independently on separate hardware
One Microservice must perform one single specific job
Scaling up/down of a specific microservice is possible
A change in one microservice need redeployment of that service, other microservice are unaffected
we are free to choose appropirate tech for each service

Important feature of microservice
- Small autonomous services working together
- Developed and deployed independentally
- they are cloud enabled
