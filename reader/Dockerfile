FROM eclipse-temurin:11 AS builder
WORKDIR /app
COPY ./gradle ./gradle
COPY ./gradlew ./gradlew
COPY ./build.gradle ./build.gradle
COPY ./gradle.properties ./gradle.properties
RUN ./gradlew dependencies
COPY ./src ./src
RUN ./gradlew jar

FROM spark:3.5.0-scala2.12-java11-ubuntu
COPY --from=builder /app/build/*.jar /opt/spark/examples/jars/reader.jar