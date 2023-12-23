FROM amazoncorretto:21.0.1-alpine3.18

COPY build/libs/springboot_health-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

LABEL authors="kingnathanal"