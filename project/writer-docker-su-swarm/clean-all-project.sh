#!/bin/bash

gradle clean -b eureka-server/build.gradle 
gradle clean -b writer-service/build.gradle 
gradle clean -b masterpiece-service/build.gradle 
gradle clean -b production-service/build.gradle
gradle clean -b zuul/build.gradle 