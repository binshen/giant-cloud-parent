FROM java:8

ADD target/giant-cloud-zipkin-1.0.jar /opt/giant-cloud-zipkin-1.0.jar

EXPOSE 9411

ENTRYPOINT ["java","-jar","/opt/giant-cloud-zipkin-1.0.jar"]
