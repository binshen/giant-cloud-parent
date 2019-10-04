FROM java:8

ADD target/giant-service-tests-1.0.jar /opt/giant-service-tests-1.0.jar

EXPOSE 10099

ENTRYPOINT ["java","-jar","/opt/giant-service-tests-1.0.jar"]
