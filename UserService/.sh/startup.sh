# !/usr/bin/bash

# Simple bash script to pull latest 
# built user-service image from DockerHub
# and deploy in container

#docker pull henrylao/user-service:latest

# -p <host>:<container>
#docker run -d -e SERVER_PORT=8090 -p 8090:8080 -it henrylao/user-service:latest
#docker run -d -e -p 8090:8080 -it henrylao/user-service:latest
#docker run -p 8090:8080 -t henrylao/user-service:latest
docker run
