########################################################
# Dockerfile per l'applicazione productions service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/production-0.0.1-SNAPSHOT.jar production.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "production.jar"]