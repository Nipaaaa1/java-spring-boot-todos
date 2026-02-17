# Spring Boot Todo API

![Java](https://img.shields.io/badge/Java-17+-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![H2 Database](https://img.shields.io/badge/Database-H2-lightgrey)
![License](https://img.shields.io/badge/License-Learning%20Project-blue)

Simple REST API Todo App built with:

- Spring Boot 4
- Spring Data JPA
- H2 Database (file-based)
- Bean Validation
- Global Exception Handling

Project ini dibuat untuk pembelajaran dasar:
- Layered architecture (Controller → Service → Repository)
- JPA Entity mapping
- Validation dengan @Valid
- Custom error handling
- Embedded database

---

## 🚀 Features

- Create Todo
- Get All Todos
- Get Todo by ID
- Update Todo
- Delete Todo
- Request validation
- Clean JSON error response
- H2 database console

---

## 🧱 Tech Stack

- Java 17+
- Spring Boot 4
- Spring Web
- Spring Data JPA
- H2 Database
- Jakarta Bean Validation

---

## 📂 Project Structure

src/main/java/com/example/todos/ │ ├── controller/ │   └── TodoController.java │ ├── service/ │   └── TodoService.java │ ├── repository/ │   └── TodoRepository.java │ ├── model/ │   └── Todo.java │ ├── dto/ │   └── TodoRequest.java │ ├── GlobalExceptionHandler.java └── TodoApplication.java

---

## ⚙️ Configuration

`application.properties`

spring.datasource.url=jdbc:h2:file:./todos spring.datasource.driverClassName=org.h2.Driver spring.datasource.username=sa spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect spring.jpa.hibernate.ddl-auto=update spring.jpa.show-sql=true

spring.h2.console.enabled=true spring.h2.console.path=/h2-console

---

## ▶️ Run The Application

### 1️⃣ Clone project

git clone <repository-url> cd <project-folder>

### 2️⃣ Build

mvn clean install

### 3️⃣ Run

mvn spring-boot:run

Server will start at:

http://localhost:8080

---

## 🗄 H2 Database Console

Open in browser:

http://localhost:8080/h2-console

Use:

- JDBC URL: `jdbc:h2:file:./todos`
- Username: `sa`
- Password: (empty)

---

## 📡 API Endpoints

### 🔹 Get All Todos

GET /api/todos

---

### 🔹 Get Todo by ID

GET /api/todos/{id}

---

### 🔹 Create Todo

POST /api/todos

Body:

```json
{
  "title": "Belajar Spring Boot",
  "done": false
}


---

🔹 Update Todo

PUT /api/todos/{id}

Body:

{
  "title": "Belajar Spring Boot JPA",
  "done": true
}


---

🔹 Delete Todo

DELETE /api/todos/{id}


---

✅ Validation Rules

title tidak boleh kosong

title minimal 3 karakter


Example invalid request:

{
  "title": "",
  "done": false
}

Response:

{
  "title": "Title tidak boleh kosong"
}


---

🧠 Architecture Overview

Client
  ↓
Controller
  ↓
Service
  ↓
Repository (Spring Data JPA)
  ↓
Hibernate
  ↓
H2 Database


---

📌 Notes

Database menggunakan file-based H2 (todos.mv.db)

ddl-auto=update hanya untuk development

Untuk production, gunakan migration tool seperti Flyway



---

🎯 Learning Goals

Project ini cocok untuk belajar:

REST API basics

Spring Boot auto-configuration

Entity & JPA mapping

Validation with @Valid

Clean exception handling

Embedded database usage



---

📜 License

Free to use for learning purposes.
