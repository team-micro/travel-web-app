# remove all containers
docker rm $(docker ps -aq)

# remove all images
docker rmi $(docker images -q)



