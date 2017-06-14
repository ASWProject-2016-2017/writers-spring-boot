#!/bin/bash

gradle build -b eureka-server/build.gradle 
gradle build -b writer-service/build.gradle 
gradle build -b masterpiece-service/build.gradle 
gradle build -b production-service/build.gradle
gradle build -b zuul/build.gradle 