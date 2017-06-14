#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-server-img-9014 ./eureka-server 
docker build --rm -t ${DOCKER_REGISTRY}/masterpieces-img-9014 ./masterpieces-service 
docker build --rm -t ${DOCKER_REGISTRY}/productions-img-9014 ./productions-service
docker build --rm -t ${DOCKER_REGISTRY}/writers-img-9014 ./writers-service
docker build --rm -t ${DOCKER_REGISTRY}/writers-zuul-img-9014 ./zuul