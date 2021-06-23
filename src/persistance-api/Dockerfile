FROM openjdk:11
COPY target/*.jar /usr/src/myapp/persistence-api.jar
WORKDIR /usr/src/myapp/
CMD ["java", "-jar" , "persistence-api.jar"]