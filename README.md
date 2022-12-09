# spring-cloud-stream
#### Includes the necessary services to display some features of Spring Cloud stream with rabbitMQ

### steps
- First, install springCloudStream as root
- Second, Run each service as a Spring Boot app
- Then, call the service below as http client of ProducerController to send the message in the queue
  ###
  GET http://localhost:9098/api/value/testvalue

### notes
- You can visit rabbitMQ dashboard and follow your message in the queue:
  http://localhost:15672/#/queues