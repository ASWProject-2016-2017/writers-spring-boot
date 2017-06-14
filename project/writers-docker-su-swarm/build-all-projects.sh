#!/bin/bash

gradle build -b eureka-server/build.gradle 
gradle build -b writers-service/build.gradle 
gradle build -b masterpieces-service/build.gradle 
gradle build -b productions-service/build.gradle
gradle build -b zuul/build.gradle 