# Storage <a id="top"></a>

### Contents

1. [Amazon S3](#one)
2. [AmWS Integrated Services](#two)
3. [EBS - Amazon Elastic Bookstore](#three)
4. [EFS - Amazon Elastic File System](#four)
5. [The Snow Family](#five)

<br/>

---

<br/>

## $Amazon$ $S3$ <a id="one"></a>
&nbsp; Commonly known as S3, the Amazon Simple Storage Services is fully-managed and object-based storage service which is highy integrated with other services as well as scalable due to it's unlimited capacity (although there is a maximum size for any individual file). As it's object based, storage does not get stored in a hierarchal structure like it does on a local machine. A region for the data must be selected, and durability is incredibly high as copies are stored in multiple availability zones with availbility upwards of 95% for data. <br/>
&nbsp; S3 uses buckets as containers for data, and is how data is located and stored within S3. Buckets are created first, and then data can be uploaded to a bucket, and folders may be created within buckets. There are also many different classes of storage within S3 which can be viewed within any object's details, alongside it's key, URL, and whether or not encryption is enabled. Objects can then be opened, downloaded, and removed from the bucket as needed, and creating buckets and adding objects is straightforward: simple click create a new bucket, choose a region, choose versioning and server access settings, encryption settings, public access permissions, and then review and create the bucket. Objects can then be easily uploaded to the bucket as with any file service, or new folders created to then upload the object to. <br/>
&nbsp; S3 has a variety of storage classes based on the needs of the user. These include Standard, Intelligent-Tiering, Standard-IA*, One Zone-IA, and Glacier and serve different purposes with different costs associated with them. The main difference between classes is durability, availability, and cost. Data which is less available such as Glacier and Glacier Deep Access (cold storage) has worse availability but considerable less cost and is usually highly durable. Different classes serve different data storage needs

| CLASS | HIGH THROUGHPUT | LOW LATENCY | DATA ACCESS | DURABILITY | AVAILABILITY | SSL ENCRYPTION | LIFECYCLE RULES |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
| *S3 Standard* | ✅ | ✅ | Frequent | Eleven 9s | 99.99% | ✅ | ✅ |
| *S3 INT* | ✅ | ✅ | Frequent & Infrequent | Eleven 9s | 99.9% | ✅ | ✅ |
| *S3 S-IA* | ✅ | ✅ | Infrequent | Eleven 9s | 99.9% | ✅ | ✅ |
| *S3 Z-IA* | ✅ | ✅ | Infrequent | Eleven 9s | 99.5% | ✅ | ✅ |
| *S3 Glacier* | ❌ | ❌ | Accessable at cost** | Eleven 9s | 99.99% | ✅ | ✅ |
| *S3 G_DA* | ❌ | ❌ | Minimal within 12 hours | Eleven 9s | 99.99% | ✅ | ✅ |

###### *Infrequent Access
###### ** Expedited Retrieval for <= 250mb - less than 5 mins | Standard Retrieval for any size - 3-5 hours | Bulk Retrieval for  <= 1PB at a time - 5-12 hours


<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $AWS$ $Integrated$ $Storage$ <a id="two"></a>
&nbsp; Amazon EC2 Instance Storage holds data on the same host that provides the EC2 instance, acting as a local disk drive to that instance. This data is considered temporary (ephermeral) so not recommended for critical or valuable data as data is lost when the instance is stopped (but returns when rebooted) and it is not always possible to extract the data and store elsewhere from the instance volume. However, this form of storage is much cheaper than persistant storage (included in instance price), and offers a very high I/O speed, so is great for using as cache or buffer for data that is rapidly changing, and often also used within a load balancing group where data is replicated and shared throughout the group. <br/>
&nbsp; Not all instance types support instance store volumes, and the capacity of the instance store volume increases as the instance increases, as well as having the same mechanisms as provided by EC2 as they are not a seperate storage option so inherit policies and rules. As a result, it is not advised to use instance storage for data that needs to be accessed by multiple users or groups.

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $EBS$ - $Amazon$ $Elastic$ $Blockstore$ <a id="three"></a>
&nbsp; Elastic Blockstore (EBS) provides storage for EC2 instances using EBS volumes offering different benefits and features to the included EC2 Instance Storage depending on user needs and preferences. The volumes are persistant and block-stored, and can be easily attached to instances although still independant to the instance. As a result, however, only a single EBS volume can be attached to an EC2 instance at any one time, although multiple can be attached to the instance in general. <br/>
&nbsp; EBS also offers backups known as snapshots to store and backup data and then stored in S3, and is incremental meaning they only record and store changes in data. Additionally, a new volume can be created from a snapshot if so desired. Snapshots can also be copied across regions which improves reliability and availability and prevents loss of data. <br/>
&nbsp; There are two types of EBS storage available to users; **Solid State Storage** and **Hard Disk Drive** - not disimilar to traditional/local computers - and allows users to choose storage types which suit their needs based on cost (HDD is cheaper) or performance (SSD is higher). Within those two storage types, there are specific sub-categorized depending on need for performance and cost further, such as HDD cold-storage. <br/>
&nbsp; EBS Security is designed with enhancement in mind, both at rest and in-transit, which is useful when storing personal or sensitive data, or when encryption is required. EBS will manage and maintain the ecryption process for the user, although some encryption options are only available with certain instance types. EBS volumes can easily be created from scratch or from a snapshot when provisioning an EC2 instance, or as a standalone volume, but can only be attached to an EC2 instance in the same availability zone. 

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $EFS$ - $Amazon$ $Elastic$ $File$ $System$ <a id="four"></a>
&nbsp; The Amazon Elastic File System (EFS) is another storage type available, and where S3 is object-based, and Amazon Blockstore is block-based, EFS is considered file storage and uses standard file-system semantics such as hierarchy of directories, locking files, and renaming/updating files. EC2 instances can access EFS using configured Mount Points, and Mount Points can be configured in multiple availability zonee and/or multiple EC2 instances. EFS is fully-managed, easily scalable with low latency, and can maintain high levels of throughput, and can work with any OS that can work with standard on-premise file systems. However, EFS is not available in all regions at present. <br/>
&nbsp; EFS also offers a variety of storage classes, as well as the ability to configure performance factors to better suit specific end-user needs. The two classes offered are **standard** and **infrequent access (IA)** which can then be further configured, although both are available across all EFS regions and offer the same availability and durability, and come with lifecycle management. <br/>
&nbsp; Within each class, two key performance options can also be selected: **general purpose** and **max I/O** which are defined during creation. General purpose offers all round performance, whereas max I/O is better suited to those with higher throughput (unlimited compared to general's standard), and although both options offer 7Ks IOPS, max I/O does have a higher latency. Generally, general purpose is better if an application does not exceed 7k/second operations, which can be checked using CloudWatch. <br/>
&nbsp; Finally, one may which to configure specific throughput settings. Burst throughput operatings by building BurstCredits at times when throughput is below the minimum threshold, which can then be used to significantly increase throughut beyond the upper threshold for the storage size. Provisioned throughput, on the other hand, allows for the same burst above the threshold as burst without need for BurstCredits but will occur additional charges for bursting above the default option, so is generally most useful for those who require consistent high-performance and speedy access to data.

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $The$ $Snow$ $Family$ <a id="five"></a>
&nbsp; The Snow Family refers to a range of physical hardware devices which are designed to assist and enable transference to the cloud, and include AWS Snowcone, AWS Snowball, and AWS Snowmobile, and can also be used to transfer data back out of the cloud. Generally, transfer to the cloud happens programmatically using the browser interface or CLI, whereas with the snow family users are sent a piece of hardware on which to transfer their data and once the transfer is complete, the hardware is sent back to amazon to process and transfer to S3. These devices can be considerably quicker than transfer otherwise, coming with impressive storage capacity (8TB for snowcone up to 100PB for snowmobile) and can include EC2 instances to support with transfer to the cloud. 

| DEVICE | STORAGE | COMPUTE | PORTABLE | RUGGED | ENCRYPTION | ANTI-TAMPER | SECURE ERASE | TRACKED | USE-CASE |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | --- | ---- | ---- |
| *Snowcone* | 8TB | ✓ | ✓ | ✓ | ✓ | ✓ | ✓ | ✓ | Portability, limited power support |
| *Snowball* | 80TB | ✓ | ✗ | ✓ | ✓ | ✓ | ✓ | ✓ | Large-scale data transfer, need enhanced graphics, clustering |
| *Snowmobile* | 100PB | ✓ | ✗ | ✓ | ✓ | ✓ | ✓ | ✓ | Transferring massive amounts of data (e.g., entire datacenter) |


### **AWS OpsHub**
&nbsp; The AWS OpsHub is a GUI designed with the Snow Family in mind. It's an application which can be downloaded to Mac OS or Windows and can be downloaded when a snow device is delivered and is used to unlock the device. It can be used to configure fleets and/or clusters, manage file storage and compute functions, and is fully integrated with AWS Systems Manager to assist with automating of tasks. 

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---