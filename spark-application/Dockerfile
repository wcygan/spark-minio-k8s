FROM eclipse-temurin:11 AS builder
WORKDIR /app
COPY ./gradle ./gradle
COPY ./gradlew ./gradlew
COPY ./build.gradle ./build.gradle
RUN ./gradlew dependencies
COPY ./src ./src
RUN ./gradlew jar

FROM spark:3.3.1
WORKDIR /app
COPY --from=builder app/build/*.jar ./spark-application.jar