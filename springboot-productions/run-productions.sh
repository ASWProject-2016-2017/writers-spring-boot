#!/bin/bash

# Script per avviare il servizio productions(servizio secondario)

echo Running PRODUCTIONS
gradle build
java -Xms64m -Xmx128m -jar build/libs/springboot-productions-0.0.1-SNAPSHOT.jar