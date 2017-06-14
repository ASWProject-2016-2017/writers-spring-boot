#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-server-img-9014
docker push ${DOCKER_REGISTRY}/masterpieces-img-9014
docker push ${DOCKER_REGISTRY}/productions-img-9014
docker push ${DOCKER_REGISTRY}/writers-img-9014
docker push ${DOCKER_REGISTRY}/writers-zuul-img-9014