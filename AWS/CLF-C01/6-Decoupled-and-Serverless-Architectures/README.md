# Decoupled and Serverless Architecture <a id="top"></a>

### Contents
1. [Introduction](#one)
2. [Decoupled Architecture: Simple Queue Service](#two)
3. [Event-Driven Architecture: Simple Notification Service](#three)
4. [Event-Driven Archietcture: Amazon Kinesis](#four)
<br/>

---

<br/>

## $Introduction$ <a id="one"></a>
&nbsp; In the past, applications where built with a monolithic structure, where applications are tighly coupled together with a lot of built-in dependancies to one another. However, in recent times, **decoupled architecture** has become the focus. Decoupled architecture, as the name suggests, decouples the solutions and components so they are able to opperate independantly. A key benefits of this is that the lack of dependancy and interconnectedness with other components (e.g., a backend and frontend build together) means changes to one component do not interfer with (and risk breaking) another component, and each part can be expanded, improved, or modifyied without concern around the impact on the application as a whole. Interfaces are then used to allow each component to communicate with each other, which remain constant throughout. <br/>
&nbsp; **Event-driven architecture** is not disimilar, with the key defining feature being that the services are triggered by events which occur within the infrastructure. An event could be a change in state (such as an EC2 instance stopping or starting), or and order being placed on an e-commerce sight. Event-drive architecture will generally consist of:

* **Producer:** *A producer is an element within the infrastructure which pushes an event to the router*
* **Event router:** *The event router is then responsible for processing the event and pushes the outcome to the consumer*
* **Consumer:** *Finally, a consumer executes the action as required by the event-router. The event router decouples the producer from the consumer.*
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $Decoupled$ $Architecture:$ $Simple$ $Queue$ $Service$ <a id="two"></a>
&nbsp; A Simple Queue Service (SQS) is simply a service which handles the delivery of messages between various decoupled components. AWS SQS does exactly this, and has the capability to send, store, and recieve messages up to huge scales without losing any message data. AWS SQS is made up of a producer, a queue (similar to event-router), and a consumer. Additionally, there are three types of queue used within SQS:

&nbsp; **Standard Queues** are default, and support at-least-once delivery of messages, meaning the messages may be distributed to the queue more than once and can alter the order of the messages, and only offers a best-effort to preserve message ordering on messages sent from the producer. They do offer an almost unlimited number of transactions per second, and are highly scalable. <br/>
&nbsp; **FIFO Queues** prioitise the order of messages in the queue, and ensure the order is maintained as well as preventing duplication of messages. FIFO queues, however, do have a limit to transaction per second of 300, but increases to 3,000 if batching is used. <br/>
&nbsp; **Dead-Letter Queues** are not a source queue for holding messages from producers, like the other two. Instead, a dead-letter queue is used to send messages which failed to process by a consumer, as the consumer sends the message to a dead-letter queue rather than back to the message queue it recieved it from. This enables assessment of why the message failed and to support with debugging, and must be the same type as the source queue it was used against (standard or FIFO).
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $Event$-$Driven$ $Architecture:$ $Simple$ $Notification$ $Service$ <a id="three"></a>
&nbsp; The Simple Notification Service (SNS) is used as a publish/subscribe service and is highly integrated with other AWS services. It is centered around topics, which are message groups, and users/endpoints can 'subscribe' to this topic where the messages will be published and recieved by all subscribers. The publishers can be compared to producers, which send messages to an SNS topic. The SNS topic acts as the event router, and then sends the message to the subscribers (consumers) using either HTTP/S, email, SQS, application, AWS lambda, or SMS. A subscriber could be a website rather than a user, for example. <br/>
&nbsp; Topics must be configured with various policies, such as access policies (e.g., IAM) to setup who can access them and how they will be distributed to consumers. This can all be done from within the AWS SNS service, where options to edit the policies will be available for any and all topics created. Policies are layed out in a similar way to IAM policies, and are edited as a JSON data structure. As implied earlier, SNS does integrate with SQS, as SQS can be used to send messages to subscribers. To do this, the SQS queue needs to be subcribed to the SNS topic, and the SNS service operates as the producer for the SQS queue. SNS can also be integrated with AWS Lambda and can act as a trigger for a lambda function, which uses the payload of the message as an input parameter. 
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $Event$-$Driven$ $Architecture:$ $Amazon$ $Kinesis$ <a id="four"></a>
&nbsp; Amazon Kinesis is used for processing and collecting streams of real-time data, such as application logs or website clickstreams, and processes the data into databases, data lakes, and data warehouses as needed. Kinesis collects, responds, and processes data in real-time, rather than collecting and then processing later when storage is fully connected. There are three key serices:
* Kinesis Streams: Streaming service which can scale to support vast amounts of data
* Kinesis Data Firehose: Enables streaming data to be loaded into Kinesis Analytics among other AWS services
* Kinesis Analytics: Allows for the analysis and processing of data using SQL queries

| **AMAZON KINESIS STREAMS** | **AMAZON KINESIS DATA FIREHOSE** | **AMAZON KINESIS ANALYTICS** |
| ----------- | ------------ | ------------- |
| Consists of records made of a sequence number, a partiction key, and a data blob. A producer pushes data to Amazon Kinesis Streams, which then pushes them to consumers to process in real time. Consumers are known as Amazon Kinesis Streams Applications (usually a fleet of EC2 instances) built either with the Kinesis API or Client Library. Streams is ideal for data which requries processing. | A fuly-managed services which delivers real-time data to the required destination. Users do not need to write applications as their consumers, as data producers can be configured to send data to firehose, which will then deliver the data automatically to the appropriate service, and can even transform data before delivery. Firehose is ideal for data which requires zero-admin. | Analytics enables SQL code to be used to quickly process, read, and store data. The individual datapoints can be then aggregated to provide insight, and requires an input stream, an SQL process logic, and an output stream for results to be fed to. Analytics is best for processing data in real-time for insightful analytic |
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---