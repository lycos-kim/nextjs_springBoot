
# 🚀 Full-Stack Web Application (Next.js 15 & Spring Boot 3.4)

이 프로젝트는 **Next.js 15** 프론트엔드와 **Spring Boot 3.4 (Java 25)** 백엔드를 결합한 현대적인 풀스택 애플리케이션 실습 저장소입니다.  
Nginx와 Docker를 사용하여 대기업 표준 구조인 '리버스 프록시' 환경을 로컬에 구현하였습니다.

---

## 🛠 Tech Stack

### Frontend
- **Framework**: [Next.js 15](nextjs.org) (App Router)
- **Language**: TypeScript
- **Styling**: Tailwind CSS
- **Port**: 3000

### Backend
- **Framework**: [Spring Boot 3.4](spring.io)
- **Language**: Java 25
- **Build Tool**: Maven
- **Port**: 8080

### Infrastructure
- **Web Server**: Nginx (Reverse Proxy / Port: 80)
- **Container**: Docker, Docker Compose

---

## 📂 Project Structure

```text
.
├── backend/           # Spring Boot API Server
├── frontend/          # Next.js Web Client
├── docker-compose.yml # Docker 컨테이너 오케스트레이션 설정
└── README.md          # 프로젝트 통합 가이드
코드를 사용할 때는 주의가 필요합니다.

🏃 Getting Started (Local Development)
개발 환경에서는 각각의 서버를 독립적으로 실행하여 Hot Reload 기능을 활용합니다.
1. 사전 준비 (Prerequisites)
Node.js: v20 이상 설치
Java: JDK 25 설치
VS Code: Spring Boot & Java Extension Pack 설치
2. Backend 실행 (Spring Boot)
bash
cd backend
# Maven을 이용한 서버 구동 (Windows: mvnw.cmd / Mac,Linux: ./mvnw)
./mvnw spring-boot:run
코드를 사용할 때는 주의가 필요합니다.

API 확인: http://localhost:8080/api/hello
3. Frontend 실행 (Next.js)
bash
cd frontend
# 의존성 설치 및 개발 서버 실행
npm install
npm run dev
코드를 사용할 때는 주의가 필요합니다.

브라우저 접속: http://localhost:3000
🐳 Running with Docker (Integrated Mode)
운영 환경과 동일하게 Nginx를 입구(Entry Point)로 하여 모든 서비스를 한 번에 구동합니다.
1. 서비스 빌드 및 실행
bash
# 프로젝트 최상위 루트 폴더에서 실행
docker-compose up --build
코드를 사용할 때는 주의가 필요합니다.

2. 접속 정보
통합 접속 주소: http://localhost (80번 포트로 통합)
동작 방식:
/api/* 경로 요청 👉 Nginx가 내부망의 backend:8080으로 전달
그 외 모든 경로 요청 👉 Nginx가 내부망의 frontend:3000으로 전달
📝 Key Features & Learnings
Java 25 & Next.js 15: 2026년 기준 최신 기술 스택을 활용한 풀스택 연동
REST API 통신: GET/POST 방식을 통한 프론트-백 간의 데이터 교환 실습
CORS 해결: Nginx 리버스 프록시 설정을 통해 브라우저 보안 정책(CORS) 문제 해결
Containerization: Dockerfile을 이용한 각 서비스의 독립적인 이미지 빌드 및 최적화
State Management: React useState와 useEffect를 활용한 실시간 명단 업데이트 구현