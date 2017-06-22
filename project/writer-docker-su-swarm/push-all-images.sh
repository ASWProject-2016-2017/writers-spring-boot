#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-server-img-9014
docker push ${DOCKER_REGISTRY}/masterpiece-img-9014
docker push ${DOCKER_REGISTRY}/production-img-9014
docker push ${DOCKER_REGISTRY}/writer-img-9014
docker push ${DOCKER_REGISTRY}/writer-zuul-img-9014