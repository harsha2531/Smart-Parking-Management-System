# 🚗 Smart Parking Management System (SPMS)

A microservice-based backend system developed using Spring Boot that enables real-time parking space discovery, reservation, and management in urban environments. Built as part of the final coursework for the *ITS 1018 – Software Architectures & Design Patterns II* module.

---

## 📌 Project Description

The Smart Parking Management System (SPMS) solves common urban parking challenges such as traffic congestion, space unavailability, and fuel wastage. It allows users to locate and reserve parking spaces while enabling space owners to manage availability dynamically.

---

## 🎯 Objectives

- Enable drivers to **search and reserve** parking spots in real-time.
- Allow space owners to **manage** and **monitor** their parking areas.
- Simulate **vehicle entry/exit** and **track usage** by zone and owner.
- Perform mock **payments** and generate **digital receipts**.
- Maintain historical logs for auditing and user reference.

---

## 🧱 Microservice Architecture

| Service Name        | Description                                                |
|---------------------|------------------------------------------------------------|
| `eureka-server`     | Service registry for dynamic discovery                     |
| `config-server`     | Centralized configuration for all services                 |
| `api-gateway`       | Single entry point to route all external/internal requests |
| `user-service`      | Manages user registration, authentication, and profiles    |
| `vehicle-service`   | Manages vehicle details and links to users                 |
| `parking-service`   | Manages parking space availability and reservations        |
| `payment-service`   | Simulates payment flows and digital receipts               |

---

## 🛠️ Tech Stack

- **Java 17**, **Spring Boot 3+**
- Spring Cloud:
  - **Eureka Server**
  - **Spring Cloud Config**
  - **Spring Cloud Gateway**
- **MySQL** (or in-memory DB during testing)
- **Postman** for API testing
- **Maven** as build tool

---

## 🚀 How to Run the Project

1. Clone the repository.
2. Start the `eureka-server`.
3. Start the `config-server`.
4. Start the `api-gateway`.
5. Start the remaining microservices one by one (`user-service`, `vehicle-service`, etc.).
6. Verify all services are registered in [Eureka Dashboard](http://localhost:8761/).

---

## 🔗 Resources

- [Postman Collection](./docs/postman/Smart-Parking-Management-System.postman_collection.json)
- ![Eureka Dashboard](./docs/eureka-dashboard-screenshot/eureka_dashboard.png)

---

## 📸 Screenshots

### ✅ Eureka Server Dashboard

![Eureka Dashboard](./docs/eureka-dashboard-screenshot/eureka_dashboard.png)
---

## 📃 License

This project is submitted as academic coursework for evaluation purposes only. Reuse or distribution beyond academic use is not permitted without permission.

---
