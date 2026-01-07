# 1단계: 빌드 환경 (Java 25가 포함된 공식 이미지를 정확히 지정)
FROM eclipse-temurin:25-jdk AS build
WORKDIR /app

# Maven 설치 및 환경 설정
RUN apt-get update && apt-get install -y maven

# 빌드 수행
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# 2단계: 실행 환경
FROM eclipse-temurin:25-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
