# 🚀 SaaS Subscription Management Platform

A production-style SaaS backend application built with **Spring Boot 3**, **Java 21**, **PostgreSQL**, **JWT Authentication**, **Stripe Payments**, and **Docker**.

This project demonstrates how modern SaaS applications manage users, organizations, subscriptions, payments, and secure REST APIs.

---

## 📌 Features

### 🔐 Authentication
- JWT Authentication
- Spring Security
- BCrypt Password Encryption
- Secure REST APIs

### 👥 Organization Management
- Create Organization
- Update Organization
- Delete Organization
- View Organizations

### 💳 Subscription Management
- Create Subscription
- View Subscription
- Manage Subscription Status
- Stripe Customer Creation

### 💰 Stripe Integration
- Create Stripe Customer
- Stripe Checkout Session
- Stripe Webhook Integration
- Subscription Payment Flow

### 🚩 Feature Management
- Feature Flags
- Feature Availability API

### 📖 API Documentation
- Swagger UI
- OpenAPI Documentation

### 🐳 DevOps
- Docker
- Docker Compose
- Maven Build

### 🛡 Exception Handling
- Global Exception Handler
- Bean Validation

---

# 🏗 Architecture

```
               +---------------------+
               |     React Client    |
               +----------+----------+
                          |
                          |
                    REST API
                          |
        +-----------------+-----------------+
        |                                   |
        |        Spring Boot Backend        |
        |                                   |
        +-----------------+-----------------+
                          |
          -----------------------------------
          |                |                |
          |                |                |
     PostgreSQL        Stripe API      JWT Security
```

---

# 🛠 Tech Stack

| Technology | Version |
|------------|---------|
| Java | 21 |
| Spring Boot | 3.x |
| Spring Security | ✓ |
| JWT | ✓ |
| PostgreSQL | 16 |
| Hibernate | JPA |
| Maven | 3.x |
| Docker | ✓ |
| Swagger | OpenAPI |
| Stripe | Latest SDK |

---

# 📂 Project Structure

```
src
 ├── controller
 ├── dto
 ├── entity
 ├── repository
 ├── security
 ├── service
 ├── config
 ├── exception
 └── resources
```

---

# 🔑 Authentication

The application uses JWT Authentication.

### Register

```
POST /api/v1/auth/register
```

### Login

```
POST /api/v1/auth/login
```

Returns

```
JWT Token
```

---

# 📌 Organization APIs

```
POST   /api/v1/organizations

GET    /api/v1/organizations

GET    /api/v1/organizations/{id}

PUT    /api/v1/organizations/{id}

DELETE /api/v1/organizations/{id}
```

---

# 💳 Stripe APIs

### Create Checkout Session

```
POST /api/v1/stripe/checkout
```

### Stripe Webhook

```
POST /api/v1/stripe/webhook
```

---

# 📖 Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

# 🐳 Docker

Build

```bash
docker compose build
```

Run

```bash
docker compose up
```

---

# 🗄 Database

PostgreSQL

Tables

- users
- organizations
- subscriptions
- feature_flags

---

# 🚀 Future Improvements

- Role Based Authentication
- Refresh Tokens
- Email Verification
- Password Reset
- Subscription Upgrade/Downgrade
- Audit Logs
- CI/CD Pipeline
- Kubernetes Deployment

---

# 👩‍💻 Author

**Lakshmi Padmavathi**

Java Full Stack Developer

GitHub:
https://github.com/Lakshmi068

LinkedIn:
(Add your LinkedIn profile here)

---

## ⭐ If you found this project helpful, consider giving it a Star!
