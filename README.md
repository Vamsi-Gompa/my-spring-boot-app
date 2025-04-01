# My Spring Boot Application

This is a simple Spring Boot application that serves as a starting point for building web applications using the Spring framework.

## Project Structure

```
my-spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── MySpringBootApp.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── index.html
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── MySpringBootAppTests.java
│       └── resources
├── pom.xml
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Setup Instructions

1. Clone the repository:
   ```
   git clone <repository-url>
   cd my-spring-boot-app
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8080`.

## Usage

This application serves a static HTML page located at `src/main/resources/static/index.html`. You can modify this file to change the landing page content.

## Testing

Unit tests are located in the `src/test/java/com/example/MySpringBootAppTests.java` file. You can run the tests using:
```
mvn test
```

## License

This project is licensed under the MIT License.