# !/usr/bin/bash

##############################################
# ---------------
# -- IMPORTANT --
# ---------------
# This script will remove all local images and 
# containerized apps on the local machine
#
##############################################

# remove all containers
docker rm $(docker ps -aq)

# remove all images
docker rmi $(docker images -q)



