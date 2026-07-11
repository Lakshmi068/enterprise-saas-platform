# 🚀 Enterprise SaaS Subscription Management Platform

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue)
![Spring Security](https://img.shields.io/badge/Spring%20Security-JWT-success)
![Stripe](https://img.shields.io/badge/Stripe-Payments-purple)
![Docker](https://img.shields.io/badge/Docker-Container-blue)
![Swagger](https://img.shields.io/badge/API-Swagger-green)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A production-style SaaS backend application built with **Spring Boot 3**, **Java 21**, **PostgreSQL**, **Spring Security**, **JWT Authentication**, **Stripe Payments**, and **Docker**.

This project demonstrates how modern SaaS platforms securely manage users, organizations, subscriptions, online payments, and REST APIs using industry-standard backend development practices.

---

# ✨ Features

## 🔐 Authentication & Security

- User Registration
- User Login
- JWT Authentication
- Spring Security
- BCrypt Password Encryption
- Stateless Authentication
- Protected REST APIs

---

## 👥 Organization Management

- Create Organization
- Update Organization
- Delete Organization
- View Organizations

---

## 💳 Subscription Management

- Create Subscription
- View Subscription
- Manage Subscription Status
- Associate Subscription with Organizations
- Stripe Customer Creation

---

## 💰 Stripe Integration

- Stripe Customer Creation
- Stripe Checkout Session
- Secure Stripe Webhook Verification
- Subscription Payment Processing
- Payment Success Event Handling

---

## 🚩 Feature Management

- Feature Flags
- Feature Availability APIs

---

## 📖 API Documentation

- Swagger UI
- OpenAPI Documentation

---

## 🛡 Exception Handling

- Global Exception Handler
- Validation Handling
- Meaningful Error Responses

---

## 🐳 DevOps

- Docker
- Docker Compose
- Maven
- Environment Variables (.env)

---

# 🏗 Architecture

```
                    +-----------------------+
                    |     React Client      |
                    +-----------+-----------+
                                |
                           REST APIs
                                |
                +---------------+---------------+
                |                               |
                |     Spring Boot Backend       |
                |                               |
                +---------------+---------------+
                                |
        --------------------------------------------------
        |                     |                         |
        |                     |                         |
   PostgreSQL            Stripe API              JWT Security
```

---

# 🛠 Technology Stack

| Category | Technology |
|-----------|------------|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Security | Spring Security, JWT |
| ORM | Spring Data JPA, Hibernate |
| Database | PostgreSQL |
| Payments | Stripe API |
| Build Tool | Maven |
| Containerization | Docker, Docker Compose |
| API Documentation | Swagger / OpenAPI |

---

# 📂 Project Structure

```
src
├── controller
├── service
├── repository
├── entity
├── dto
├── security
│   └── jwt
├── exception
├── config
└── resources
```

---

# 🔐 Environment Variables

Sensitive configuration is **not stored in the repository**.

Create a `.env` file using the provided `.env.example`.

Example:

```properties
DB_URL=jdbc:postgresql://localhost:5432/saas_db
DB_USERNAME=postgres
DB_PASSWORD=your_password

JWT_SECRET=your_jwt_secret

STRIPE_SECRET_KEY=your_stripe_secret_key
STRIPE_PUBLISHABLE_KEY=your_publishable_key
STRIPE_WEBHOOK_SECRET=your_webhook_secret
```

---

# ▶ Running Locally

## Clone Repository

```bash
git clone https://github.com/Lakshmi068/enterprise-saas-platform.git
```

## Navigate to Project

```bash
cd enterprise-saas-platform
```

## Run Application

Using Maven Wrapper

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

# 🐳 Running with Docker

Build the application

```bash
docker compose build
```

Start all services

```bash
docker compose up
```

Stop containers

```bash
docker compose down
```

---

# 📚 Available REST APIs

## Authentication

```
POST /api/v1/auth/register
POST /api/v1/auth/login
```

---

## Organizations

```
POST   /api/v1/organizations
GET    /api/v1/organizations
GET    /api/v1/organizations/{id}
PUT    /api/v1/organizations/{id}
DELETE /api/v1/organizations/{id}
```

---

## Users

```
User Management APIs
```

---

## Features

```
Feature Management APIs
```

---

## Subscriptions

```
Subscription Management APIs
```

---

## Stripe

```
POST /api/v1/stripe/checkout
POST /api/v1/stripe/webhook
```

---

# 📖 Swagger Documentation

Once the application is running:

```
http://localhost:8080/swagger-ui/index.html
```

---

# 🗄 Database

Database:

- PostgreSQL 16

Primary Tables

- users
- organizations
- subscriptions
- features

---

# 🔒 Security

This application follows modern backend security practices:

- JWT Authentication
- BCrypt Password Encryption
- Stateless Authentication
- Spring Security Filter Chain
- Protected REST APIs
- Secure Stripe Webhook Signature Verification

---

# 📸 Project Highlights

- ✅ JWT Authentication
- ✅ PostgreSQL Integration
- ✅ Stripe Checkout
- ✅ Stripe Webhooks
- ✅ Dockerized Application
- ✅ Environment Variable Configuration
- ✅ Swagger Documentation
- ✅ Layered Architecture
- ✅ Production-style Backend Design

---

# 🚀 Future Enhancements

- Role-Based Access Control (RBAC)
- Refresh Token Authentication
- Email Verification
- Forgot Password / Reset Password
- Subscription Upgrade & Downgrade Workflows
- Redis Caching
- Kafka Event Streaming
- AWS Deployment
- Kubernetes Deployment
- CI/CD Pipeline (GitHub Actions)
- Monitoring with Prometheus & Grafana

---

# 👩‍💻 Author

**Lakshmi Padmavathi**

Senior Java Full Stack Developer

GitHub

https://github.com/Lakshmi068

LinkedIn

> https://www.linkedin.com/in/lakshmi-devara-a5ab301aa/

---

# 📄 License

This project is licensed under the MIT License.

---

## ⭐ Support

If you found this project helpful, please consider giving it a ⭐ on GitHub.

It helps others discover the project and supports continued development.