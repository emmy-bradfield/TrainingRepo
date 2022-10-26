# Networking <a id="top"></a>

### Contents
1. [Virtual Private Cloud: Intro & Subnets](#one)
2. [Security and Network Access Control Lists](#two)

## $Virtual$ $Private$ $Cloud$ $(VPC)$: $Intro$ & $Subnets$ <a id="one"></a>
&nbsp; VPCs are comprised of subnets. When a VPC is created, a CIPD must also be specified, and any subnets within the VPC must be within the CIPD range. Subnets can be public (accessable via the internet) or private (only accessable to you), and in general any customer VPC is only accessable by that customer by default - only you can access your VPC. A public subnet within a VPC will have a private IP address as well as a public IP address, and requires an internet gateway to be publically available. Additionally, a route will need to be added to the public subnets route table which will contain a destination field (where you are trying to access) and a target field (the route to that destination). For the public subnet internet gateway, this will look similar to: 

| DESTINATION | ROUTE |
| ---- | ---- |
| 10.0.1.0/16 | local |
| 0.0.0.0/0 | igw-21268a45 |

&nbsp; Running all subnets within the same availability zone can be risky - if that server goes down the whole application goes down. As a result, having additional subnets in multiple availability zones can reduce this risk, and the use of the local route (see above) allows all the subnets to communicate with oneanother. 

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

---

<br/>

## $Security$ $and$ $Network$ $Access$ $Control$ $Lists$ <a id="two"></a>
&nbsp; Network Access Control Lists (NACL) are used to determine who can and who cannot access a subnet, and by default the NACL created when a new subnet is created will allow all inbound and outbound traffic. This is stored in a table similar to the route table and looks something like this:

### **INBOUND**
| Rule # | Type | Protocol | Port Range | Source | Allow/Deny |
| ---- | ---- | ---- | ---- | ---- | ---- |
| 1 | HTTP(80) | TCP (6) | 80 | 0.0.0.0/0 | ALLOW |
| 2 | HTTPS(80) | TCP (6) | 443 | 0.0.0.0/0 | ALLOW |
|  | ALL Traffic | ALL | ALL | 0.0.0.0/0 | DENY |

### **OUTBOUND**
| Rule # | Type | Protocol | Port Range | Destination | Allow/Deny |
| ---- | ---- | ---- | ---- | ---- | ---- |
| 1 | ALL Traffic | ALL | ALL | 0.0.0.0/0 | ALLOW |
|  | ALL Traffic | ALL | ALL | 0.0.0.0/0 | DENY |

&nbsp; Rules are executed in order of their rule number, with the default rule to block all else included at the end. In the first example, all HTTP and HTTPS traffic is allowed in - as it is a web server - whereas in the second table any and all traffic can be sent outbound. Another way of controlling traffic is to use security groups which are similar, but work at the instance level. <br/>
&nbsp; Security groups don't run rules in order, and a rule in a security group is considered allow, but otherwise the tables are structured in a similar way (demonstrated below). Subnets can then be added based on their CIPD to the security group with the CIPD as the source, allowing access for that subnet to communicate with others to whole the security rule is applied. Security groups will be associated with the specific resources within the subnet, whereas NACLs are associate with the subnet. As a result, if a NACL allows traffic but the security group does not, then the NACL will allow the inbound traffic to communicate with the subnet, but it will not successfully communicate with the actual resources contained within, acting as if it had not been given access at all. 

| Type | Protocol | Port Range | Source |
| ---- | ---- | ---- | ---- |
| MYSQL/Aurora | TCP | 3306 | 10.0.1.0/24 |

&nbsp; A NAT gateway can also be used to enhance access whilst maintaining security. In essence, a NAT gateway exists within the public subnet and allows the private subnet to route via the public to the internet gateway. This is useful when considering things like the ability to download updates, and is configured in the route table of the private subnet like in the example below. Additionally, the NAT gateway will not allow inbound traffic, and will only accept outbound communications from within the VPC.

| DESTINATION | TARGET |
| ---- | ---- |
| 10.0.1.0/16 | local |
| 0.0.0.0/0 | nat-0f98486fdb542aeeb |

&nbsp; Another component of security are Bastion Hosts. These are are EC2 instances which sit within the public subnet, and serve the specific role of enabling secure communication from external sources to the private subnet. The Bastion host will be specifically configured to the IP address of the user who needs access - such as an engineer - and enable them to communicate with the private subnet. The route table for the private subnet must also be configured to allow traffic in from the security group which is used to enable the inbound traffic to the public subnet:

| | | | | |
|---|---|---|---|---|
| Security group created with IP added | $ -> $ | Security group added to public subnet Bastion EC2 Instance | $ -> $ | Inbound allowed from security group in private subnet route table|

&nbsp; However, from here more needs to be configured. It wouldn't be secure to store the private key for the private subnet in the Bastion, or anywhere public, so whilst the user could SSH into the public subnet, SSH forwarding must be setup to allow them to access the private subnet. This allows the private key to be stored on the private subnet on the local client, so from the Bastion host a user can SSH into the private subnet using the private key stored locally.

<br/>

<div style="text-align:right;">
<a href="#top">Back To Top</a>
</div>

--- 