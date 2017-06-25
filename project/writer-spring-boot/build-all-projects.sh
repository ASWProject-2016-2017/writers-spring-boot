#!/usr/bin/env bash

gradle build -b springboot-masterpiece/build.gradle
gradle build -b springboot-production/build.gradle
gradle build -b springboot-writer/build.gradle
