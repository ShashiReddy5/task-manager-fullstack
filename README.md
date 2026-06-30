# Task Manager Full Stack Application

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Angular](https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white)
![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

A full-stack **Task Management Application** with a Spring Boot REST API backend and an Angular/React frontend. Supports user authentication, task creation, priority management, and real-time status tracking.

---

## Tech Stack

### Backend
- Java 17 + Spring Boot 3.x
- Spring Security with JWT Authentication
- Spring Data JPA + Hibernate
- MySQL Database
- Maven build tool
- RESTful API design

### Frontend
- Angular 16+ (primary UI)
- React 18 (alternative UI)
- TypeScript
- Bootstrap / Angular Material

### DevOps
- Docker and Docker Compose
- AWS deployment ready

---

## Features

- User registration and login with JWT-based authentication
- Create, read, update, and delete tasks (full CRUD)
- Assign priority levels: Low, Medium, High, Critical
- Track task status: To Do, In Progress, Review, Done
- Filter and search tasks by priority, status, or assignee
- Responsive UI that works on desktop and mobile
- RESTful API with Swagger/OpenAPI documentation
- Role-based access control (Admin and User roles)

---

## API Endpoints

### Authentication
| Method | Endpoint | Description |
|---|---|---|
| POST | /api/auth/register | Register new user |
| POST | /api/auth/login | Login and get JWT token |

### Tasks
| Method | Endpoint | Description |
|---|---|---|
| GET | /api/tasks | Get all tasks |
| GET | /api/tasks/{id} | Get task by ID |
| POST | /api/tasks | Create new task |
| PUT | /api/tasks/{id} | Update task |
| DELETE | /api/tasks/{id} | Delete task |
| GET | /api/tasks/status/{status} | Filter by status |
| GET | /api/tasks/priority/{priority} | Filter by priority |

---

## Getting Started

### Prerequisites
- Java 17+
- Node.js 18+ and npm
- MySQL 8+
- Docker (optional)

### Backend Setup

```bash
git clone https://github.com/ShashiReddy5/task-manager-fullstack.git
cd task-manager-fullstack/backend

# Configure database in src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=your_username
spring.datasource.password=your_password

mvn clean install
mvn spring-boot:run
# API runs at http://localhost:8080
```

### Frontend Setup (Angular)

```bash
cd task-manager-fullstack/frontend-angular
npm install
ng serve
# App runs at http://localhost:4200
```

### Run with Docker Compose

```bash
docker-compose up --build
# App: http://localhost:4200
# API: http://localhost:8080
# Swagger: http://localhost:8080/swagger-ui.html
```

---

## Project Structure

```
task-manager-fullstack/
├── backend/
│   └── src/main/java/com/shashi/taskmanager/
│       ├── controller/
│       ├── service/
│       ├── repository/
│       ├── model/
│       └── security/
├── frontend-angular/
│   └── src/app/
│       ├── components/
│       ├── services/
│       └── models/
├── docker-compose.yml
└── README.md
```

---

## Author

**Shashidhar Reddy**
- GitHub: [@ShashiReddy5](https://github.com/ShashiReddy5)
- LinkedIn: [linkedin.com/in/shashidharreddy-java](https://www.linkedin.com/in/shashidharreddy-java/)

---

Star this repo if you find it useful!
