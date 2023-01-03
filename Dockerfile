FROM maven:latest AS build
RUN mkdir -p /home/cris/git/desafioemprestimospf/desafioemprestimospf
COPY /pom.xml /home/cris/git/desafioemprestimospf/desafioemprestimospf
RUN mvn -f /home/cris/git/desafioemprestimospf/desafioemprestimospf/pom.xml clean package

FROM openjdk:11
COPY --from=build home/cris/git/desafioemprestimospf/desafioemprestimospf/target/desafioemprestimospf-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
EXPOSE 5505
ENTRYPOINT ["java","-jar","/app.jar"]

