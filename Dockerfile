FROM openjdk:11
COPY target/spring-boot-app-1.1.jar  /usr/app
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "spring-boot-app-1.1.jar"]