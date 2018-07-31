FROM openjdk:8-jdk-alpine
ADD target/uc_debat.jar uc_debat.jar
EXPOSE 8095
ENTRYPOINT ["java","-jar","uc_debat.jar"]