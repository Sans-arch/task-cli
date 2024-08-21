# Task CLI Application 🚀

## Overview 📋

Task CLI is a command-line interface application designed to manage tasks efficiently. Built with Java and Spring Boot, it leverages an in-memory H2 database for persistence and provides a simple yet powerful way to handle task management.

## Features ✨

- **Task Management**: Create, update, and delete tasks.
- **Task Status**: Track task status (Pending, Completed).
- **Timestamping**: Automatic creation timestamps for tasks.
- **In-Memory Database**: Uses H2 for quick setup and testing.

## Technologies Used 🛠️

- **Java 17**
- **Spring Boot 3.3.2**
- **Spring Data JPA**
- **Spring Shell**
- **H2 Database**
- **Maven**

## Getting Started 🚀

### Prerequisites 📋

- Java 17 or higher
- Maven

### Installation 🛠️

1. **Clone the repository**:
    ```sh
    git clone https://github.com/Sans-arch/task-cli
    cd task-cli
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

### Usage 💻

Once the application is running, you can use the CLI to manage tasks. Here are some basic commands:

- **Create a new task**:
    ```sh
    task create "Your task description"
    ```

- **List all tasks**:
    ```sh
    task list
    ```

- **Get an existing task**:
    ```sh
    task get <task-id>
    ```

- **Update a task status**:
    ```sh
    task update <task-id> --status COMPLETED
    ```

- **Delete a task**:
    ```sh
    task delete <task-id>
    ```

### Configuration ⚙️

The application uses an in-memory H2 database by default. You can configure the database settings in the `src/main/resources/application.properties` file.

```ini
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true