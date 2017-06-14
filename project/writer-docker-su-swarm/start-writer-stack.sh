#!/bin/bash

echo 'Starting writer application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-writer.yml writer-9014