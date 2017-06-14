#!/bin/bash

echo 'Starting writers application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-writers.yml writers