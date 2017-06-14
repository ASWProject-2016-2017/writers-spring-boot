#!/bin/bash

echo 'Removing writer application as a stack' 

source "docker.env"

docker stack rm writer-9014