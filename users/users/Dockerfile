FROM openjdk:8-jdk-alpine as build
VOLUME /tmp
EXPOSE 80
EXPOSE 8088
ADD ./target/users-0.0.1-SNAPSHOT.jar	 users-0.0.1-SNAPSHOT.jar	
ENTRYPOINT [ "java", "-DskipTests", "-jar", "ed-session-management-service-0.0.1.jar", "-Xmx256m"]
