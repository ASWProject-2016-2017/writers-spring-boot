########################################################
# Dockerfile per l'applicazione masterpieces service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/masterpiece-0.0.1-SNAPSHOT.jar masterpiece.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "masterpiece.jar"]