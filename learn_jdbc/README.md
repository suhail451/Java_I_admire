# Student Database Management System (JDBC + MVC)

![Java](https://img.shields.io/badge/Java-17+-orange)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![MVC](https://img.shields.io/badge/Architecture-MVC-brightgreen)

A console-based student database management system implementing MVC architecture with Java JDBC.

## Features

- 🗃️ **CRUD Operations**:
  - Create new student records
  - Read/View existing records
  - Update student information
  - Delete records
- 🏗️ **MVC Architecture**:
  - Clear separation of concerns
  - Modular and maintainable code
- 🔐 **Database Security**:
  - Prepared statements to prevent SQL injection
- 📋 **Console Interface**:
  - Simple text-based menu system

## Project Structure
src/
├── learn_jdbc/
│ ├── Model.java # Handles database operations
│ ├── View.java # Manages user interface
│ ├── Controller.java # Orchestrates application flow
│ └── Main.java # Entry point


## Prerequisites

- Java JDK 17+
- MySQL Server 8.0+
- MySQL Connector/J (included in most IDEs)

## Setup Instructions

1. **Database Setup**:
   ```sql
   CREATE DATABASE cws;
   USE cws;
   CREATE TABLE STUDENT(
       ROLL INT PRIMARY KEY,
       NAME VARCHAR(100)
   );

   String url="jdbc:mysql://localhost:3306/cws";
String name="root";
String password ="yourpassword";

javac learn_jdbc/Main.java
java learn_jdbc.Main
