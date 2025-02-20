# Hotel Reservations API

## Overview

The **Hotel Reservations API** is a Spring Boot application that provides endpoints to manage hotel data, including retrieving a list of available hotels and adding new hotels to the system. This API connects to a **MySQL** database and utilizes **Spring Data JPA** for data persistence.

## Technologies Used

- Java 
- Spring Boot 
- Spring Data JPA
- MySQL Database

## Project Structure

```
hotel_reservations/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── hotel_reservations/
│   │   │   │   │   │   ├── controller/
│   │   │   │   │   │   ├── model/
│   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── HotelReservationsApplication.java
│   └── resources/
│       ├── application.properties
│       ├── schema.sql
│       ├── data.sql
```

## Setup & Installation

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/hotel_reservations.git
```

### 2. Install MySQL

Ensure MySQL is installed on your system. If not, follow the official guide to install it: [MySQL Installation Guide](https://dev.mysql.com/doc/refman/8.0/en/installing.html).

### 3. Create the Database

```sql
CREATE DATABASE kk;
```

### 4. Configure `application.properties`

Edit `src/main/resources/application.properties` with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/kk
spring.datasource.username=root  
spring.datasource.password=*****  # Replaced my password with * 
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
```

### 5. Run SQL Scripts

Use `schema.sql` to create necessary tables:

```sql
CREATE TABLE hotel (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  location VARCHAR(255) NOT NULL,
  pricePerNight FLOAT NOT NULL
);
```

### 6. Run the Application

```bash
mvn spring-boot:run
```

## API Endpoints

### 1. GET `/hotels`

Fetches a list of all hotels.

#### Request:

```http
GET http://localhost:8080/hotels
```

#### Response:

```json
[
  {
    "id": 1,
    "name": "Grand Plaza",
    "location": "New York",
     "pricePerNight": 120.5
  },
  {
    "id": 2,
    "name": "Seaside Resort",
    "location": "Goa",
     "pricePerNight": 150.75
  },
  {
    "id": 3,
    "name": "Mountain Lodge",
    "location": "Switzerland",
     "pricePerNight": 200.0
  }
]
```

### 2. POST `/hotels`

Adds a new hotel.

#### Request:

```http
POST http://localhost:8080/hotels
Content-Type: application/json

{
  "name": "Ocean View Hotel",
  "location": "123 Beach St, Ocean City",
  "pricePerNight": 150.0
}
```

#### Response:

```json
{
  "id": 4,
  "name": "Ocean View Hotel",
  "location": "123 Beach St, Ocean City",
  "pricePerNight": 150.0
}
```

## Screenshots
### Post Request
![Screenshot 2025-02-18 202117](https://github.com/user-attachments/assets/6b7a2703-e84b-448d-8bbf-03984f1f0627)
### Get Request
![Screenshot 2025-02-18 202147](https://github.com/user-attachments/assets/5d7cf58c-20d6-4a34-8dae-ca94430771b3)


---

### Author

Karthikeya Kanumuri

