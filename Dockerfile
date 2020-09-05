##stage 1
FROM maven:3.6.3-jdk-11-slim as build
ARG MVN_LOCAL_REPO=.m2/repository
WORKDIR /build
COPY . ./

RUN mvn clean install -f game/pom.xml -Dmaven.repo.local=${MVN_LOCAL_REPO}

#stage 2
FROM openjdk:11
COPY --from=build /build/game/target/game*.jar app.jar

#Puertos
EXPOSE 8080

#ENTRYPOINT una vez que se levanta el container
ENTRYPOINT ["java","-jar","/app.jar"]
