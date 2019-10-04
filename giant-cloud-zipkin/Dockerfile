FROM java:8

ADD target/giant-cloud-zipkin-1.0.jar /opt/giant-cloud-zipkin-1.0.jar

EXPOSE 9411

ENTRYPOINT ["java","-jar","/opt/giant-cloud-zipkin-1.0.jar"]

#  cd giant-cloud-parent/giant-cloud-zipkin
#  docker build -t giant-cloud-zipkin-1.0 .
#  docker run -p 9411:9411 giant-cloud-zipkin-1.0