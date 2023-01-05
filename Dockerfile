FROM openjdk:11

WORKDIR /opt/spring_boot
COPY ./target/desafio*.jar ./usr/local/lib/app.jar
EXPOSE 8081
EXPOSE 5505
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]

FROM maven:latest AS build
RUN mkdir -p /home/cris/git/desafioemprestimospf/desafioemprestimospf
COPY /pom.xml /home/cris/git/desafioemprestimospf/desafioemprestimospf
RUN mvn -f /home/cris/git/desafioemprestimospf/desafioemprestimospf/pom.xml clean package