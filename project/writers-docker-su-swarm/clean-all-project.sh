#!/bin/bash

gradle clean -b eureka-server/build.gradle 
gradle clean -b writers-service/build.gradle 
gradle clean -b masterpieces-service/build.gradle 
gradle clean -b productions-service/build.gradle
gradle clean -b zuul/build.gradle 