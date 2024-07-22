FROM amazoncorretto:17
WORKDIR /app
ARG JAR_FILE=build/libs/coduo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} coduo_server.jar
ENTRYPOINT ["java","-jar","coduo_server.jar"]
