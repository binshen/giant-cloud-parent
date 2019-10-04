FROM java:8

ADD target/giant-cloud-eureka-1.0.jar /opt/giant-cloud-eureka-1.0.jar

EXPOSE 10100

ENTRYPOINT ["java","-jar","/opt/giant-cloud-eureka-1.0.jar"]

#  cd giant-cloud-parent/giant-cloud-eureka
#  docker build -t giant-cloud-eureka-1.0 .
#  docker run -p 10100:10100 giant-cloud-eureka-1.0