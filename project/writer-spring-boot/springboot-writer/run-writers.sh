#!/bin/bash

# Script per avviare il servizio writers(servizio principale)

echo Running WRITERS

java -Xms64m -Xmx128m -jar build/libs/writers-0.0.1-SNAPSHOT.jar
