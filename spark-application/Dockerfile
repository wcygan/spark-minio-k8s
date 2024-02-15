FROM eclipse-temurin:11 AS builder
WORKDIR /app
COPY ./gradle ./gradle
COPY ./gradlew ./gradlew
COPY ./build.gradle ./build.gradle
RUN ./gradlew dependencies
COPY ./src ./src
RUN ./gradlew jar

FROM eclipse-temurin:11
WORKDIR /app
COPY --from=builder app/build/*.jar ./spark-application.jar
CMD ["java", "-jar", "spark-application.jar"]