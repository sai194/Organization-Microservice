FROM frolvlad/alpine-oraclejre8
LABEL maintainer="Sai Yeluri <sai194@gmail.com>"
LABEL description="Employee Microservice"
COPY ./target/employee-service-1.0.jar /opt/aspire/
WORKDIR /opt/aspire/
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "employee-service-1.0.jar"]