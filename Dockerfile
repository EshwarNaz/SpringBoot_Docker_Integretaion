FROM openjdk:11

COPY target/sb_docker.jar/usr/app/

WORKDTR /usr/app

ENTRYPOINT ["java","-jar","sb_docker_app.jar"]