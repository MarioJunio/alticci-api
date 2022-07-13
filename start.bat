@ECHO
./mvnw clean install
docker build -f src/main/docker/Dockerfile.jvm -t marioj/alticci .
docker run -i --rm -p 8080:8080 marioj/alticci
PAUSE