# Utiliser l'image officielle de Java
FROM openjdk:17-jdk-slim

# Ajouter le JAR de l'application dans le container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Exposer le port sur lequel l'application va écouter
EXPOSE 8080

# Démarrer l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/app.jar"]

