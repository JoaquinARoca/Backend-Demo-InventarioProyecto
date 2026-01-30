# Demo Inventory API

## Description
API RESTful for inventory management developed in Java with Spring Boot,using Spring Data JPA for data persistence in PostgreSQL.

## Technologies
- Java 17+
- Spring Boot 3.5.10
- Spring Data JPA
- PostgreSQL
- Maven
- BCrypt Password Encoder

## Project Structure
```structure
src/main/java/
├── controller/    # REST Controllers 
├── model/         # JPA Entities  
├── repository/    # Spring Data JPA Interfaces 
├── service/       # Buisness Logic
└── config/        # Configuration Classes
```

## Instalation & Setup
### prerequisites
- Java 17 or Higher
- PostgreSQL
- Maven 3.8+
- IDE (IntelliJ IDEA, VS Code, Eclipse)

### Clone repository
git clone Backend-Demo-InventarioProyecto
cd **"inventory-api"**

### Database Setup
- Open pgAdmin4
- Create database
```pgAdmin4
Database_name = "db_name" 
```

```.env
#BBDD
DB_URL=jdbc:postgresql://localhost:5432/"db_name"
DB_USERNAME="your-postgre-user"
DB_PASSWORD="your-postgre-password"

#SERVER
SERVER_PORT="your-desired-port"
APP_NAME=backend_inventory
```
### Build & Run
```mvn
- mvn clean install
- mvn spring-boot:run
```

