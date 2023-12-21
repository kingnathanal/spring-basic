FROM eclipse-temurin:21.0.1_12-jre-jammy

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

LABEL authors="kingnathanal"