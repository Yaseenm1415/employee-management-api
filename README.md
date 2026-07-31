# Employee Management API

A RESTful Employee Management API built using **Spring Boot**, **Spring Data JPA (Hibernate)**, and **MySQL**. This project demonstrates CRUD (Create, Read, Update, Delete) operations for managing employee records through REST endpoints.

## 🚀 Features

* Create a new employee
* Retrieve all employees
* Retrieve an employee by ID
* Update employee details
* Delete an employee
* RESTful API design
* Spring Data JPA integration
* MySQL database connectivity

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* Postman

## 📁 Project Structure

```
src
├── controller
├── entity
├── repository
├── service
└── EmployeeApplication.java
```

## 📌 API Endpoints

| Method | Endpoint             | Description           |
| ------ | -------------------- | --------------------- |
| POST   | `/api/employee`      | Create a new employee |
| GET    | `/api/employees`     | Get all employees     |
| GET    | `/api/employee/{id}` | Get employee by ID    |
| PUT    | `/api/employee`      | Update an employee    |
| DELETE | `/api/employee/{id}` | Delete an employee    |

## 🗄️ Database

Example Employee table:

| Column | Type    |
| ------ | ------- |
| id     | Integer |
| name   | String  |
| gender | String  |
| salary | Double  |

## ▶️ Getting Started

### Prerequisites

* Java 17 or later
* Maven
* MySQL

### Clone the Repository

```bash
git clone https://github.com/Yaseenm1415/employee-management-api.git
```

### Configure the Database

Update the `application.properties` file with your MySQL credentials.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

## 🧪 Testing

Use **Postman** or any API testing tool to test the available endpoints.

## 👨‍💻 Author

**Yaseen M**

GitHub: https://github.com/Yaseenm1415
