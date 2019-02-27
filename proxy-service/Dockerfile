FROM frolvlad/alpine-oraclejre8
LABEL maintainer="Sai Yeluri <sai194@gmail.com>"
LABEL description="Proxy Microservice"
COPY ./target/proxy-service-1.0.jar /opt/aspire/
WORKDIR /opt/aspire/
EXPOSE 8060
ENTRYPOINT ["java", "-jar", "proxy-service-1.0.jar"]