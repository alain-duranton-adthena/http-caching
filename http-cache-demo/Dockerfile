# Build stage 0
FROM maven:3.6.3-openjdk-14-slim

WORKDIR /buildroot

COPY . ./

RUN mvn clean install

# Build stage 1
FROM openjdk:14-slim

WORKDIR /app

COPY --from=0 "/buildroot/target/http-cache-demo-0.0.1-SNAPSHOT.jar" /app/app.jar

CMD ["java","-jar","/app/app.jar"]
