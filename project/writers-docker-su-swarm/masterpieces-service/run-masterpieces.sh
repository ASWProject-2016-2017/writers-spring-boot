#!/bin/bash

# Script per avviare il servizio masterpieces(servizio secondario)

echo Running MASTERPIECES
gradle build
java -Xms64m -Xmx128m -jar build/libs/masterpieces-0.0.1-SNAPSHOT.jar