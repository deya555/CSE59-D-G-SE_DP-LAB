# Software Requirements Specification (SRS)

## Preface

This document provides the Software Requirements Specification (SRS) for the **Bank Management System (BMS)**. It defines the system’s functionalities, performance criteria, security requirements, and overall system architecture necessary for development.

---

## Version History

* **Version 1.0** – Initial Draft.
* **Version 1.1** – Added non-functional requirements and system models.
* **Version 1.2** – Refined system evolution and ER diagram.

---

## 1. Introduction

### Purpose

The Bank Management System is a secure, user-friendly software application designed to provide core banking services digitally. It allows users to manage accounts, perform transactions, check balances, withdraw money, change PINs, and view transaction history efficiently.

---

### Document Conventions

This document follows the IEEE SRS standard, using:

* **Must** – Indicates mandatory requirements.
* **Should** – Indicates recommended features.
* **May** – Indicates optional enhancements.

---

### Intended Audience and Reading Suggestions

* **Project Managers & Developers** – For system implementation guidance.
* **Bank Administrators** – To understand system operations.
* **Testers & QA Teams** – To validate compliance with requirements.
* **Stakeholders & Business Analysts** – To understand system capabilities.

---

### Scope

The system provides:

* User authentication and login system
* Account management and dashboard
* Balance enquiry feature
* Cash withdrawal functionality
* PIN change module
* Mini statement generation
* Full transaction history tracking

---

### References

* IEEE Standard 830-1998 (Software Requirements Specification)
* Banking Security Guidelines
* Internal System Design Documentation

---

## 2. Overall Description

### Product Perspective

The Bank Management System is a standalone application that replaces manual banking operations with a digital and automated solution.

---

### Product Functions

* Secure user authentication
* Account balance enquiry
* Cash withdrawal processing
* PIN change functionality
* Mini statement generation
* Transaction history management

---

### User Classes and Characteristics

* **Customer/User:** Performs banking operations such as withdrawal, balance check, and PIN change.
* **Bank Admin (Optional):** Manages user accounts and system configuration.

---

### Operating Environment

* Web-based or desktop application
* Cross-browser support (Chrome, Firefox, Edge)
* Backend database (MySQL / PostgreSQL)
* Server-based deployment environment

---

### Design and Implementation Constraints

* Must follow banking security standards
* Must ensure encrypted storage of sensitive data
* Must support secure authentication mechanisms

---

### Assumptions and Dependencies

* Users must have a valid bank account
* Internet or local network connectivity is required
* Database system must operate 24/7

---

## 3. System Requirements Specification

### Functional Requirements

### User Authentication

* The system must allow users to log in using Account Number and PIN.
* The system must validate credentials before granting access.

---

### User Dashboard

* The system must display a dashboard after successful login.
* The dashboard must provide navigation to all banking services.

---

### Balance Enquiry

* The system must allow users to view their current account balance.
* Balance must be retrieved from the database in real time.

---

### Withdraw Money

* The system must allow users to withdraw money from their account.
* The system must check sufficient balance before processing transactions.

---

### PIN Change

* The system must allow users to change their PIN securely.
* Old PIN verification must be required before updating.

---

### Mini Statement

* The system must display the last 5–10 transactions.
* Each transaction must include date, type, and amount.

---

### Transaction History

* The system must record all transactions including deposits and withdrawals.
* Users must be able to view complete transaction history.

---

## Non-Functional Requirements

### Performance Requirements

* The system must support multiple users simultaneously.
* Transactions must be processed within seconds.

---

### Security Requirements

* PIN must be stored in encrypted form in the database.
* Role-based authentication must be implemented.
* All sensitive data must be protected from unauthorized access.

---

### Usability Requirements

* The system must provide a simple and user-friendly interface.
* Navigation must be intuitive and consistent.

---

### Reliability and Availability

* The system must ensure 99.9% uptime.
* Backup and recovery mechanisms must be implemented.

---

### Maintainability and Support

* The system must follow modular design principles.
* Proper logging mechanisms must be implemented for debugging.

---

### Portability

* The system should support Windows, Linux, and web-based platforms.

---

## 4. System Models

> * **ENTITY-RELATIONSHIP DIAGRAM**

<img src="images/erd image.png">

---

## 5. System Evolution

### Assumptions

* Future mobile banking application integration is possible.
* AI-based fraud detection may be added later.
* Multi-currency support may be introduced.

---

### Expected Changes

* Integration with online payment gateways
* Biometric authentication (fingerprint / face recognition)
* SMS and email notifications for transactions

---

## 6. Appendices

### Hardware Requirements

* Cloud or local server infrastructure
* Secure database server
* Backup storage system

---

### Database Requirements

* Must support relational database systems (SQL-based)
* Must maintain ACID properties for transaction safety
* Must support backup and recovery mechanisms

---
