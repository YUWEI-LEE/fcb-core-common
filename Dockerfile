From eclipse-temurin:11-jre-alpine

COPY impl/target/common-impl-0.0.1-SNAPSHOT.jar /opt/fcb-core-common.jar
CMD ["java","-jar","/opt/fcb-core-common.jar"]