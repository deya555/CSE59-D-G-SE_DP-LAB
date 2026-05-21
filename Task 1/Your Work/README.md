Software Requirements Specification (SRS)
Preface

This document provides the Software Requirements Specification (SRS) for the Bank Management System (BMS). It defines the system’s functionalities, performance criteria, security requirements, and overall system architecture necessary for development.

Version History
Version 1.0 – Initial Draft
Version 1.1 – Added functional and non-functional requirements
Version 1.2 – Included ER diagram and system model refinement
1. Introduction
Purpose

The Bank Management System is a secure software application designed to automate core banking operations. It allows users to perform essential banking activities such as login authentication, balance enquiry, withdrawals, PIN changes, mini statements, and transaction tracking in a digital environment.

Document Conventions

This document follows IEEE SRS standards:

Must – Mandatory requirement
Should – Recommended feature
May – Optional enhancement
Intended Audience and Reading Suggestions
Developers – For system design and implementation
Bank Administrators – For operational understanding
Testers / QA Teams – For validation and testing
Stakeholders – For business analysis
Scope

The system provides the following services:

Secure Login Page
User Dashboard
Balance Enquiry
Withdraw Money
PIN Change
Mini Statement
Transaction Management
References
IEEE Software Engineering Standards (IEEE 830)
Banking System Security Guidelines
System Design Documentation
2. Overall Description
Product Perspective

The Bank Management System is a standalone application designed to replace manual banking operations with an automated and secure digital system.

Product Functions
User authentication (Login system)
Account balance enquiry
Cash withdrawal
PIN update functionality
Mini statement generation
Transaction history tracking
User Classes and Characteristics
Customer/User: Performs banking operations
Bank System: Handles validation, transactions, and data storage
(Optional Admin Role): System monitoring and management
Operating Environment
Web-based or Desktop application
Cross-platform support (Windows, Linux, Mac)
Database: MySQL / PostgreSQL
Design and Implementation Constraints
Must ensure high-level banking security
PIN and sensitive data must be encrypted
Must follow secure transaction protocols
Assumptions and Dependencies
Users must have a valid bank account
System requires stable database connectivity
Internet or local network availability is required
3. System Requirements Specification
Functional Requirements
User Authentication
The system must allow users to log in using Account Number and PIN.
The system must validate credentials before granting access.
User Dashboard
The system must display a dashboard after successful login.
The dashboard must provide navigation to all banking services.
Balance Enquiry
The system must allow users to view their current account balance.
The system must fetch real-time balance from the database.
Withdraw Function
The system must allow users to withdraw money.
The system must check sufficient balance before processing transactions.
PIN Change
The system must allow users to change their PIN securely.
The system must verify the old PIN before updating.
Mini Statement
The system must display the last 5–10 transactions.
Each transaction must include date, type, and amount.
Transaction Management
The system must record all transactions (withdrawals and updates).
The system must maintain transaction history for each user.
Non-Functional Requirements
Performance Requirements
The system must handle multiple users simultaneously.
Transactions must be processed in real time.
Security Requirements
PINs must be stored in encrypted format.
The system must implement authentication and authorization.
Sensitive data must be protected against unauthorized access.
Usability Requirements
The system must have a simple and user-friendly interface.
Navigation must be intuitive for all users.
Reliability Requirements
The system must ensure 99.9% uptime.
Data consistency must be maintained at all times.
Maintainability
The system must be modular for easy updates.
Proper logging must be implemented.
Portability
The system should run on multiple operating systems.
It should support web and desktop deployment.
4. System Models
Entity Relationship (ER) Diagram

The ER diagram below represents the structure of the Bank Management System, showing relationships between User, Account, Transaction, and Mini Statement components.

ER Diagram
<img src="erd image .png" alt="Bank Management System ER Diagram" width="800"/>
Main Entities (from ER Diagram)
USER
User_ID (PK)
Name
Email
Phone
Address
Password
ACCOUNT
Account_Number (PK)
User_ID (FK)
Account_Type
Balance
Status
TRANSACTION
Transaction_ID (PK)
Account_Number (FK)
Transaction_Type
Amount
Transaction_Date
MINI_STATEMENT
Mini_Statement_ID (PK)
Account_Number (FK)
Transaction_ID (FK)
Date_Time
Amount
PIN
PIN_ID (PK)
Account_Number (FK)
PIN
Created_Date
Relationships
One USER → One ACCOUNT
One ACCOUNT → Many TRANSACTIONS
One ACCOUNT → One PIN record
TRANSACTION → MINI STATEMENT mapping for history tracking
5. System Evolution
Assumptions
Mobile banking integration may be added in future.
Biometric authentication may be introduced.
AI-based fraud detection may be integrated.
Expected Changes
Integration with online payment systems
SMS/Email notification system
Multi-factor authentication support
6. Appendices
Hardware Requirements
Secure server infrastructure
Backup storage system
Database server with high availability
Database Requirements
Relational database (SQL-based)
Must support ACID properties
Must ensure data integrity and consistency
