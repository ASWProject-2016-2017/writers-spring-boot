#!/bin/bash

echo 'Removing writers application as a stack' 

source "docker.env"

docker stack rm writers