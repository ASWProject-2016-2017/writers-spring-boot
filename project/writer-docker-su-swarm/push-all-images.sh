#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-server-9014
docker push ${DOCKER_REGISTRY}/masterpiece-9014
docker push ${DOCKER_REGISTRY}/production-9014
docker push ${DOCKER_REGISTRY}/writer-9014
docker push ${DOCKER_REGISTRY}/writer-zuul-9014