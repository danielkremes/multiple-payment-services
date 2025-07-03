# 🧾 multiple-payment-services

> Challenger project for Magalu Internship — a Spring Boot service for handling multiple payment methods.

## 📌 Project Description

This is a backend service developed using **Spring Boot 3.5.3**, designed to support multiple payment integrations. The
project is built with Java 17 and leverages Spring's robust ecosystem to support RESTful APIs, data persistence, and
validation.

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot 3.5.3**
    - `spring-boot-starter-web` - For building RESTful APIs
    - `spring-boot-starter-data-jpa` - For database persistence
    - `spring-boot-starter-validation` - For input validation
    - `spring-boot-devtools` - For development enhancements (live reload, etc.)
    - `spring-boot-docker-compose` - Docker integration support
- **PostgreSQL** - Relational database
- **Lombok** - To reduce boilerplate code
- **Maven** - Build and dependency management

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- PostgreSQL (or use Docker setup)

### Running the Project

```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### ⚙️ Configuration

- Update your application.properties or application.yml file to include PostgreSQL connection details:
  spring.datasource.url=jdbc:postgresql://localhost:5432/your-db
  spring.datasource.username=your-username
  spring.datasource.password=your-password
  spring.jpa.hibernate.ddl-auto=update

### 🧪 Testing

```bash
./mvnw test
```

### 📁 Dependencies

Key dependencies defined in pom.xml:

- spring-boot-starter-web: REST APIs
- spring-boot-starter-data-jpa: ORM with Hibernate
- spring-boot-starter-validation: Request validation
- spring-boot-devtools: Developer tools
- spring-boot-docker-compose: Docker integration
- postgresql: Database driver
- lombok: Code simplification
- spring-boot-starter-test: Testing

### 👥 Contributors

- Developer: [Daniel Kremes]

### 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

### 🌐 Additional Notes

- Built using Spring Boot's parent starter, which manages dependency versions.

- Docker support is optional and can be configured further.

- Clean architecture and modularity recommended for future scaling.




