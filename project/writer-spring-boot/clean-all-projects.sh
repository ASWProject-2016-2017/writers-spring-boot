#!/usr/bin/env bash

gradle clean -b springboot-masterpiece/build.gradle
gradle clean -b springboot-production/build.gradle
gradle clean -b springboot-writer/build.gradle
