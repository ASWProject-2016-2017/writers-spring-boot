#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-server-img-9014 ./eureka-server
docker build --rm -t ${DOCKER_REGISTRY}/masterpiece-img-9014 ./masterpiece-service
docker build --rm -t ${DOCKER_REGISTRY}/production-img-9014 ./production-service
docker build --rm -t ${DOCKER_REGISTRY}/writer-img-9014 ./writer-service
docker build --rm -t ${DOCKER_REGISTRY}/writer-zuul-img-9014 ./zuul
