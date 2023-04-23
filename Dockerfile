FROM openjdk:17-jdk-slim
WORKDIR /usr/app
COPY . .
EXPOSE 8080
CMD ["./gradlew", "bootRun", "--args='--spring.profiles.active=dev'"]