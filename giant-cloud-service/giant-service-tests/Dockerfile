FROM java:8

ADD target/giant-service-tests-1.0.jar /opt/giant-service-tests-1.0.jar

EXPOSE 10040

ENTRYPOINT ["java","-jar","/opt/giant-service-tests-1.0.jar"]

#  cd giant-cloud-parent/giant-service-tests
#  docker build -t giant-service-tests-1.0 .
#  docker run -p 10040:10040 giant-service-tests-1.0