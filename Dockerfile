FROM maven:latest AS build

WORKDIR /app

COPY ./src ./src
COPY ./pom.xml ./pom.xml

RUN mvn -f ./pom.xml clean package



FROM eclipse-temurin

WORKDIR /app

COPY --from=build /app/target/*.jar ./\start.jar

CMD [ "java","-jar","start.jar" ]



