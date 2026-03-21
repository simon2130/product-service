![CI](https://github.com/simon2130/product-service/actions/workflows/ci.yml/badge.svg)

# Product Service API (Spring Boot)

## Overview

This project is a simple **Spring Boot REST API** for managing products. It demonstrates a layered architecture using **Controller, Service, and Repository** with an in-memory H2 database.

---

## Technologies Used

* Java 21
* Spring Boot 3
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

---

## Project Structure

```
src/main/java/com/ctbe/productservice
 ├── controller
 ├── service
 ├── repository
 ├── model
```

---

## API Endpoints

### Get all products

```
GET /products
```

### Get product by ID

```
GET /products/{id}
```

### Create a product

```
POST /products
```

Request body:

```json
{
  "name": "Webcam",
  "price": 99.99
}
```

### Health check

```
GET /health
```

---

## Running the Application

1. Clone the repository:

```
git clone https://github.com/simon2130/product-service.git
```

2. Navigate to the project folder:

```
cd product-service
```

3. Run the application:

```
mvn spring-boot:run
```

---

## Testing

### Using Postman

* Test endpoints using `http://localhost:8080`
* Ensure `Content-Type: application/json` is set for POST requests

### Using Maven

```
mvn test
```

---

## Notes

* The application uses an **H2 in-memory database**, so data is lost when the application stops.
* Initial data is seeded on startup.

---

## Author

Simon Mesfin
