# Management Fundamentals <a id="top"></a>

### Contents
1. [AWS CloudTrail](#one)
2. [AWS Config](#two)
3. [Amazon CloudWatch](#three)
<br/>

---

<br/>

## $AWS$ $CloudTrail$ <a id="one"></a>
&nbsp; CloudTrail is a service provided by Amazon to record and track all API requests made in your AWS Account. These could be programatic requests, such as autoscaling sending API requests. Every API request is recorded by CloudTrail, and are known as events, with every call being recorded in the logs, and each event containing an array of metadata including identity of caller, timestamp, and IP address. New log files are created around every 5 minutes and stored within an S3 bucket, where they will remain for as long as the user wishes to enable reviewing of log history, or they can be delivered to CloudWatch Logs for monitoring and alerting via SNS. <br/>
&nbsp; CloudTrail is available across all regions, and so is able to capture vast amounts of data for multi-region services. Data can be used as an effective security call as it provides insight into potentially malicious activity by giving detailed overviews to users. Additionally, it supports with day-to-day operational issues by supporting with identifying the root cause and resolving the issue. Changes to resources within an AWS environment can also be captured and recorded with CloudTrail, and this may be necessary for various governance and compliance reasons.
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $AWS$ $Config$ <a id="two"></a>
&nbsp; AWS Config is a tool for supporting resource management. This is done by providing users with insight into resource changes by capturing that information and enabling users to further look into and gather information about those changes. It additonally stores all config changes, provides snapshots of resources at a point in time, provides SNS notifications when resources change, integrates with CloudTrail to help record logs of changes, check resources against rules setup, perform security analysis within the AWS environment, and lastly it can identify connectivity between resources. <br/>
&nbsp; Config presents this data in a simply and user-friendly, readable format. However, not all services are integrated and so Config does not capture informaiton on all AWS resources. It is also region specific, meaning it needs to be configured in each region you hold resources in, but there is an option to configure for global services such as IAM.
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $AWS$ $CloudWatch$ <a id="three"></a>
&nbsp; Amazon CloudWatch is a health-monitoring service designed to provide insight into the operation and performance of your resources. It provides insight and enables automated responses to changes in infrastructure, such as if an EC2 instance were to go down. CloudWatch is made up of many components to enable this insight:
* CloudWatch Dashboards
* CloudWatch Metrics and Anomaly Detection
* CloudWatch Alarms
* CloudWatch EventBridge 
* CloudWatch Logs
* CloudWatch Insights

&nbsp; Dashboards enable users to configure their overview of information, and can be customized by region to ensure users get the overview of their resources that serves their needs, as well as sharing the dashboard with others. Metrics are key to successful management, and CloudWatch tracks a variety of these including reads and writes for a resource or number of objects in an S3 bucket, which are collected every 5 minutes. Custom metrics can be created by users as well. Anomalies are are enabled through metrics and allows CloudWatch to detect any unusual or abnormal events using its AI. <br/>
&nbsp; Alarms works with metrics and enables automatic actions and responses to occur based on various metrics, or to send an alert to an SNS topic and notify enginers of the change. The three states of alarm are 'OK', 'Alarm', and 'Insufficient Data'. EventBridge evolved from Amazon Events, and works to provide a means of connecting applications to various targets and deliver real-time monitoring. It establishes a connection between applications and targets, allowing real-time event-driven data to be sent. It uses rules to filter incoming traffic streams and determine what to do with them, and then directs the data to the target in a JSON format, and finally to the event bus which is the component which actually recieves the information. Logs is then available to record and store the actual log outputs from applications, and finally Insights is used to monitor logs as well as configure filters and search for specific log entries. <br/>
&nbsp; The Unified CloudWatch Agent made of all the aforementioned components collects logs and metric data running on a variety of applications such as EC2 instances, as well as on-premise services, and is on top of the metric data which is by default configured by CloudWatch for the resource. CloudWatch provides log insights (analysing logs collected by CloudWatch logs and deliver visuals), container insights (collating and grouping metric data from containers, as well as capturing diagnostic data at multple levels), and lambda insights (providing detailed insight into applications using AWS lambda and supporting moitoring and troubleshooting). 
<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---