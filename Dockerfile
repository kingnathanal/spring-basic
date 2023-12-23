FROM amazoncorretto:21.0.1-alpine3.18

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]

LABEL authors="kingnathanal"