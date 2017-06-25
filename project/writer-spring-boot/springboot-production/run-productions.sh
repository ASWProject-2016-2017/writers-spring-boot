#!/bin/bash

# Script per avviare il servizio productions(servizio secondario)

echo Running PRODUCTIONS

java -Xms64m -Xmx128m -jar build/libs/productions-0.0.1-SNAPSHOT.jar
