FROM frolvlad/alpine-oraclejre8
LABEL maintainer="Sai Yeluri <sai194@gmail.com>"
LABEL description="Config Microservice"
COPY ./target/department-service-1.0.jar /opt/aspire/
WORKDIR /opt/aspire/
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "department-service-1.0.jar"]