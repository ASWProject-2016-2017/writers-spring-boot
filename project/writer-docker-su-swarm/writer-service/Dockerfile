########################################################
# Dockerfile per l'applicazione writers service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/writer-0.0.1-SNAPSHOT.jar writer.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "writer.jar"]