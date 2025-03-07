########################################
Jenkins Pipeline build
########################################
pwd
ls -ltra
chmod +x mvnw
./mvnw clean package
docker rmi ms-dormir:v1 || true
docker build -t ms-dormir:v1 .
docker tag ms-dormir:v1 96552333aa/ms-dormir:v1
docker login -u 96552333aa -p 96552333Aa docker.io
docker push 96552333aa/ms-dormir:v1
pwd
ls -ltra
cat Dockerfile

########################################
Jenkins Pipeline Deloy
########################################



########################################
SONAR
########################################
./mvnw clean verify sonar:sonar   -Dsonar.projectKey=pablo   -Dsonar.projectName='pablo'   -Dsonar.host.url=http://localhost:9000   -Dsonar.token=sqp_6fb57f4d6f92d5c3c02d649ea1272a5a39e52bf5
