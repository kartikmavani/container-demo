FROM openjdk:11
COPY target/*.jar /usr/src/myapp/sample-api.jar
WORKDIR /usr/src/myapp/
CMD ["java", "-jar" , "sample-api.jar"]