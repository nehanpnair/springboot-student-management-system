# Student Management System

A web-based **Student Management System** developed using **Spring Boot**, implementing **MVC architecture**, **JPA (Hibernate)** for data persistence, and **MySQL** as the relational database.

---

## Overview

This application allows users to manage student records through a simple and intuitive web interface. It supports basic CRUD operations such as adding and viewing student details, while ensuring data integrity through validation.

---

## Features

* Add new student records via a registration form
* View all student records in a structured table
* Auto-generated unique student ID
* Prevent duplicate email registration
* Persistent storage using MySQL database
* Clean and responsive blue-themed user interface

---

## Tech Stack

* **Backend:** Spring Boot, Spring MVC
* **Persistence Layer:** Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Frontend:** Thymeleaf, HTML, CSS
* **Build Tool:** Maven

---

## Project Structure

```
src/main/java/com/example/studentmanagement
│
├── controller       # Handles HTTP requests
├── service          # Business logic
├── repository       # Database interaction (JPA)
├── model            # Entity classes
│
src/main/resources
│
├── templates        # Thymeleaf HTML files
└── application.properties
```

---

## How to Run the Project

### 1. Clone the repository

```
git clone https://github.com/nehanpnair/springboot-student-management-system.git
```

### 2. Configure MySQL

Create a database:

```sql
CREATE DATABASE studentdb;
```

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 3. Run the application

Run the main class:

```
StudentManagementApplication.java
```

### 4. Open in browser

```
http://localhost:8080
```
