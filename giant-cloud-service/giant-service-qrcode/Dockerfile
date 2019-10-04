FROM java:8

ADD target/giant-service-qrcode-1.0.jar /opt/giant-service-qrcode-1.0.jar

EXPOSE 10020

ENTRYPOINT ["java","-jar","/opt/giant-service-qrcode-1.0.jar"]

#  cd giant-cloud-parent/giant-service-qrcode
#  docker build -t giant-service-qrcode-1.0 .
#  docker run -p 10020:10020 giant-service-qrcode-1.0