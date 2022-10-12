sudo su
yum install wget -y
wget https://golang.org/dl/go1.17.2.linux-amd64.tar.gz
rm -rf /usr/local/go && tar -C /usr/local -xzf go1.17.2.linux-amd64.tar.gz
export PATH=$PATH:/usr/local/go/bin
go version