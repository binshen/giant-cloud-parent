FROM java:8

ADD target/giant-cloud-gateway-1.0.jar /opt/giant-cloud-gateway-1.0.jar

EXPOSE 10000

ENTRYPOINT ["java","-jar","/opt/giant-cloud-gateway-1.0.jar"]

#  cd giant-cloud-parent/giant-cloud-gateway
#  docker build -t giant-cloud-gateway-1.0 .
#  docker run -p 10000:10000 giant-cloud-gateway-1.0