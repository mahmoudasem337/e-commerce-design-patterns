# E-Commerce

## Overview
This project is an e-commerce application developed in Java using JDBC for database interactions and a graphical user interface (GUI) for user interactions. It incorporates several design patterns such as Singleton, Observer, Factory, and State to enhance modularity, scalability, and maintainability
---

## Design Patterns Implemented

### 1. Singleton Design Pattern
- **Purpose:** Ensures only a single instance of critical classes like `CartManager` is created, avoiding duplication and providing a global point of access.
- **Usage:**
  - **`CartManager`:** Manages the user's shopping cart, allowing for consistent and centralized handling of cart operations.

---

### 2. Observer Design Pattern
- **Purpose:** Enables efficient notification of users regarding their order status by observing changes.
- **Usage:**
  - **`NotificationService`:** Observes order state changes and sends updates or notifications to users in real-time.

---

### 3. Factory Design Pattern
- **Purpose:** Simplifies the creation of different product types while abstracting the instantiation logic.
- **Usage:**
  - **`ProductFactory`:** Dynamically creates product instances based on their type (e.g., `Electronics`, `Clothing`, etc.), reducing the need for hard-coded object creation.

---

### 4. State Design Pattern
- **Purpose:** Manages the dynamic state transitions of orders throughout their lifecycle.
- **Usage:**
  - **`OrderState`:** Defines various states (`Pending`, `Shipped`, `Delivered`) for an order.
  - **`OrderContext`:** Handles the current state of an order and transitions between states based on actions or events.

---

## Features
- **GUI:** Intuitive and user-friendly graphical user interface for seamless interactions.
- **SQL Server Integration:** Robust database support for storing and retrieving application data.
- **Scalable Design:** Incorporates multiple design patterns to ensure modular and maintainable code.
- **Real-Time Notifications:** Keeps users informed about their order progress using the observer pattern.

---

## Getting Started

### Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher.
- **SQL Server:** Ensure the database server is running and accessible.
- **IDE:** Recommended to use IntelliJ IDEA, Eclipse, or similar.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
