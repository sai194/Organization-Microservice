# Organization-Microservice

This project covers following 
Eureka discovery
Zuul
Cloud Config
Sleuth
employee, department and organization services

I have followed below blog and updated few changes to suit my poc
https://piotrminkowski.wordpress.com/tag/spring-cloud-gateway/

http://localhost:8090/1
http://localhost:8091/organization/1/with-employees
http://localhost:8092/1/with-departments-and-employees
http://localhost:8061
http://localhost:8060/swagger-ui.html
http://localhost:8060/employee/1
http://localhost:8060/organization/1/with-employees
http://localhost:8060/department/organization/1/with-employees
http://localhost:8060/department/2
http://localhost:8060/department/2/with-departments-and-employees


http://localhost:8088/discovery-service/default
http://localhost:8088/employee-service/default

http://192.168.11.1:8061/

http://192.168.11.1:8060/employee/

http://192.168.11.1:8090/

http://192.168.11.1:8060/department/organization/1/with-employees

docker image build --file=Dockerfile --tag=cloudconfigservice:1.0 .

docker container run -d  --name=CloudConfigService -p=8088:8088 cloudconfigservice:1.0



docker image build --file=Dockerfile --tag=discoveryservice:1.0 .

docker container run -d --name=DiscoveryService -p=8061:8061 discoveryservice:1.0


docker image build --file=Dockerfile --tag=employeeservice:1.0 .

docker container run -d  --name=EmployeeService -p=8090:8090 employeeservice:1.0


docker image build --file=Dockerfile --tag=proxyservice:1.0 .

docker container run --name=ProxyService -p=8060:8060 proxyservice:1.0

docker-compose config
docker-compose up --build --force-recreate


docker swarm init

docker network create -d overlay mybridge


