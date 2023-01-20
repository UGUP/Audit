

clear
docker stop grpcservice
docker rm grpcservice
docker build -t grpcservice .
docker-compose up



 curl -sSL https://bit.ly/2ysbOFE | bash -s -- 2.2.1 1.4.9

