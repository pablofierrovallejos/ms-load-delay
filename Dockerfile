FROM openjdk:17
VOLUME /tmp
EXPOSE 8001
ADD ./target/dormir-0.0.1-SNAPSHOT.jar dormir.jar
ENTRYPOINT ["java", "-jar", "dormir.jar"]
