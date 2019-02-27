FROM frolvlad/alpine-oraclejre8
LABEL maintainer="Sai Yeluri <sai194@gmail.com>"
LABEL description="Discovery Microservice"
COPY ./target/discovery-service-1.0.jar /opt/aspire/
WORKDIR /opt/aspire/
EXPOSE 8061
ENTRYPOINT ["java", "-jar", "discovery-service-1.0.jar"]