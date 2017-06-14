########################################################
# Dockerfile per l'applicazione productions service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/productions-0.0.1-SNAPSHOT.jar productions.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "productions.jar"]