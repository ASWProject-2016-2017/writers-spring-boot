########################################################
# Dockerfile per l'applicazione writers / eureka server 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/writers-eureka-server-0.0.1-SNAPSHOT.jar writers-eureka-server.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "writers-eureka-server.jar"]