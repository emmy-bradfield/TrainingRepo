# Cloud Concepts

### Contents
1. [What is Cloud Computing](#one)
2. [Cloud Deployment Models](#two)
3. [Key Cloud Concepts](#three)
4. [Cloud Service Models](#four)
5. [Common Uses of Cloud Computing](#five)
6. [Data Center Architecture](#six)
7. [Cloud Business Benefits](#seven)

<br/>

---

<br/>

## $What$ $is$ $Cloud$ $Computing$ <a id="one"></a>
&nbsp; Cloud computing refers to a remote, virtual pool of computing resources (e.g., CPUs, Memory, Storage) available on-demand. Cloud computing is highly scalable and often auto-scaled, meaning the amount of resources used adjusts automatically based on the amount required. Cloud resources are charged in the same way as most utilities such as gas or elecetric - you pay a set rate based on how much you use, and don't pay for what you don't use. This is achieved through a hypervisor, which is a piece of software capable of creating multiple virtualized environments, allowing multiple virtual machines (VM) to be installed to the same hardware. <br/>
&nbsp; These VMs are unaware of each other and do not communicate with each other. The hypervisor sits on a layer between the VMs and the actual hardware, allowing the VMs to access the hardware they need as they need it, enabling the hardware itself to function as a shared resource. The hypervisor handles all requests from the virtual machines to access the hardware, and so ensures the resources are shared between all VMS and configured as needed. <br/>
&nbsp; Cloud resources are categorised as either Computer, Storage, Database, or Network:
### **Compute resources** 
*The 'brains' needed to complete a workload, such as CPUs or RAM*
### **Storage resources** 
*Anything which is being stored within the cloud*
### **Database resources** 
*Structured sets of data used by applications, such as an SQL databased*
### **Network resources** 
*The connectivity needed for other resources to communicate with each other*

<br/>

---

<br/>

## $Cloud$ $Deployment$ $Models$ <a id="two"></a>
There are three deployment models used within cloud computing: public, private, and hybrid:
### **The Public Cloud**
*Cloud computing resources made available through a vendor using shared infrastructure. The Public Cloud can be provisioned on-demand and is usually available over the internet. The user does not see the hardware, and all of such is provided by the vendor. The user can, however, specify the region(s) in which it resides. The vendor also managed maintenance and security*

### **The Private Cloud**
*The private cloud consists of computing resources where the infrastucture is hosted privately, such as by the company using it. The hardware is usually held on premises, and allows for further control over the hardware and backend, as well as security, but does have a higher upfront cost and requires more spending on maintenance and security by the individual or organisation themselves.*

### **The Hybrid Cloud**
*As the name suggests, the Hybrid is a combination of both deployment models. This is established with a network link connecting a private and public cloud model, and may be used when a company requires short bursts of increases resources, or to enable further control over the archetecture compared to the public cloud alone. These deployment models are usually only short-term*

<br/>

---

<br/>

## $Key$ $Cloud$ $Concepts$ <a id="three"></a>
### **On-Demand Resourcing**
*The ability to provision resources as you need, when you need, rather than waiting for hardware to be ordered, installed, and set up ready to go*

### **Scalability**
*Cloud computing enables the resources to be rapidly scaled horizontally and vertically depending on business needes. Vertical scaling refers to increasing the power and/or performance of the resources, whereas horizontal scaling refers to adding or removing the number of instances or resources in use*

### **Economy of Scale & Utility-Based Metering**
*This scalability is also much more cost-efficient due to users only being charged for what they use, similar to utility meters. Additionally, the costs of setting up large-scale computing resources and then provisioning as needed is much more cost-effective than provisioning smaller amounts as-and-when needed - akin to buying in bulk*

### **Flexability and Elasticity**
*Cloud computing is highly flexible; users decided what they want, how much they want, and how long for*

### **Growth**
*The ability to scale on-demand, the reduciton to cost, and the flexability enables growth for organisations reduces many contraints of on-premise computing resources*

### **Shared Infrastructure**
*As cloud computing is virtualized, less hardware is needed as multiple instances can be running on the same hardware. This reduces cost significantly and supports the economy of scale*

### **Highly Available**
*Many of the core services in the public cloud are replicated across multiple locations which helps enhance availability and reduce risk of services going down*

### **Security**
*Whilst there are some concerns still held over cloud computing, vendors have high standards to which they must comply and are generally more secure than an on-premise datacenter. Furthermore, as an end user you can further archetect security within the cloud to best meet your needs*

<br/>

---

<br/>

## $Cloud$ $Service$ $Models$ <a id="four"></a>
There are three key service models which can be deployed within any cloud deployments:
### **Infrastructure as a Service (Iaas)**
*IaaS refers to the highest level of customisation and control, as it enables a user to architect their own portion of the cloud by configuring their own virtual network, and allowing you to deploy and resources needed. Additionally, instances can be configured from the OS up, but the underlying host is still managed by the vendor*

### **Platform as a Service (PaaS)**
*PaaS provides greater control than SaaS as it provides access to a framework from OS up, with a vendor managing the hardware. PaaS makes a great deployment environment, enabling developers to build and deploy on top of the platform*

### **Software as a Service (SaaS)**
*SaaS offers the lowest level of customisability, as this refers to the delivery of an application. For example, GMail is software as a service which can be easily accessed by anyone anywhere. SaaS is usually simple by design*


<br/>

---

<br/>

## $Common$ $Uses$ $of$ $Cloud$ $Computing$ <a id="five"></a>
&nbsp; There are many different use cases for the cloud, and many reasons an organisation may choose to use the cloud. One of the most common is migration of production services - that is moving existing services to the clouse. Traffic bursting is another common use, where companies may utilise the cloud during boosts of business to enable them to meet demand without having to aquire more resources or reconfigure existing resources for such temporary periods. <br/>
&nbsp; Backup and Disaster Recovery are also commonly used as the cloud can be utilised as an additional storage space to backup data and reduce impact should there be a disaster, and focuses predmoninatly on storage. Web Hosting often utilises the cloud for its load-balancing and scalability to handle traffic changes, and reduces significantly the maintenance and management work. A CDN can also be used with web hosting by redirecting users based on geographic location and reducing latency caused by distance. <br/>
&nbsp; Testing and Development environments utilise the cloud often to spin up servers for testing and developing resources when specific needs are required, and Proof of Concept expands this allowing a proof of concept design to be created and showcased. <br/>
&nbsp; Laslty, a common use-case is Big Data and Data Manipulation. Due to the sheer volume and velocity of data handled, cloud computing and significantly reduce cost and enable large datasets to be handles in a more cost-effective and efficient way.


<br/>

---

<br/>

## $How$ $Data$ $Center$ $Architecture$ $is$ $Reflected$ $in$ $the$ $Cloud$ <a id="six"></a>
Cloud provider architecture is similar to traditional datacenters in many ways, although there are some key differences. Generally, cloud architecture reflects datacenters with the vendor setting it up and the user provisioning as needed

|  | *Location* | *Security* | *Physical Infrastructure* | *Network Infrastructure* | *Server* | *Storage* | 
| ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| **Datacenter** | 1+ datacenters depending on size | Managed by organisation | Situated at datacenter, managed by organisation | Installed and configured by business | Setup and configured on-premise | Setup by organisation and utilising on-premise hardware |
| **Cloud** | 2+ per region, with centers across the globe | Managed by the vendor and regulated | Situated at datacenter, managed by vendor | Operates at a software level, with options to create virtual networks and then configured from there instead of using switches or firewalls | Refered to as instances or virtual machines and provisioned as needed | Highly scalable and provisioned as-needed from the vendor by the user |


<br/>

--- 

<br/>

## $Cloud$ $Business$ $Benefits$ <a id="seven"></a>
&nbsp; Many organisaiton are keen to move to the cloud, and many less clear on what the cloud actually means. So how does one determine whether or not the cloud is right for their business? The first step is to ask three questions:
* Where is the business going?
* What are you trying to achieve?
* What are the business objectives?
&nbsp; Understanding what your business needs are and what the cloud can do to assist in achieving this is the crucial first step. Cloud computing utilises on-demand resources, scalability, enhanced security, and a variety of services - they key focus is how would the business benefit from this.

### **On-demand resources***
*Can reduce cost for businesses as resources are provisioned as and when needed*

### **Scalability**
*Enables businesses to adapt as they grow, or to fluctuations in traffic*

### **Flexability and Elasticity**
*The flexability of the cloud allows for a business to utilise what they need and not what they don't, and enables them to utilise resources in a way that is complementary to their business needs*

### **Control and Management**
*The ability to shut down and start up instances as needed, as well as having security and maintenance handled by a vendor, can enable significant control and growth for a business whilst reducing time and cost of maintenance, management, and security duties*
