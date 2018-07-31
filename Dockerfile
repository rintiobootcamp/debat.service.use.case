FROM openjdk:8-jdk-alpine
ADD target/uc_debat.jar uc_debat.jar
EXPOSE 8095
ENV JAVA_OPTS="-XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap  -XX:MaxRAMFraction=1 -XshowSettings:vm "
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar uc_debat.jar" ]