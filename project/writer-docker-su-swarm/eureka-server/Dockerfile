########################################################
# Dockerfile per l'applicazione writers / eureka server 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/writer-eureka-server-0.0.1-SNAPSHOT.jar writer-eureka-server.jar

EXPOSE 8762

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "writer-eureka-server.jar"]