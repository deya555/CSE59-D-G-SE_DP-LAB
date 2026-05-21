Software Requirements Specification (SRS)
Preface

This document provides the Software Requirements Specification (SRS) for the Bank Management System (BMS). It defines system functionalities, security requirements, performance criteria, and system design models required for development and implementation.

Version History
Version 1.0 – Initial Draft
Version 1.1 – Added system models and ER diagram
Version 1.2 – Refined functional and non-functional requirements
1. Introduction
Purpose

The Bank Management System is a software application designed to provide secure, efficient, and user-friendly banking services. The system allows users to manage their accounts, perform transactions, and access banking services such as balance enquiry, withdrawals, mini statements, and PIN changes.

Document Conventions

This document follows IEEE SRS standards:

Must – Mandatory requirement
Should – Recommended feature
May – Optional feature
Intended Audience and Reading Suggestions
Developers – For system implementation
Bank Administrators – For understanding system operations
Testers/QA Teams – For validation and testing
Stakeholders – For business understanding
Scope

The system includes the following modules:

Login Page (Authentication)
User Dashboard
Balance Enquiry
Withdraw Money
PIN Change
Mini Statement
Transaction History
References
IEEE SRS Standard 830-1998
Banking Security Guidelines
Internal System Design Documents
2. Overall Description
Product Perspective

The Bank Management System is a standalone application that manages core banking operations digitally, replacing manual banking processes.

Product Functions
Secure user authentication
Account balance checking
Cash withdrawal functionality
PIN change facility
Mini statement generation
Transaction history tracking
User Classes and Characteristics
Customer/User: Performs banking operations
Bank Admin (Optional): Manages user accounts and system control
Operating Environment
Web-based or desktop application
Cross-browser support (Chrome, Firefox, Edge)
Backend database (MySQL / PostgreSQL)
Design and Implementation Constraints
Must follow banking security standards
Must ensure encrypted data storage
Must support secure authentication
Assumptions and Dependencies
Users must have a valid bank account
Internet or local network connectivity is required
Database must be available 24/7
3. System Requirements Specification
Functional Requirements
3.1 User Authentication
The system must allow users to log in using Account Number and PIN.
The system must validate credentials before granting access.
3.2 User Dashboard
The system must display a dashboard after login.
The dashboard must provide navigation to all banking services.
3.3 Balance Enquiry
The system must allow users to view their current account balance.
Balance must be fetched from the database in real time.
3.4 Withdraw Money
The system must allow users to withdraw money from their account.
The system must validate sufficient balance before processing.
3.5 PIN Change
The system must allow users to change their PIN securely.
Old PIN must be verified before updating.
3.6 Mini Statement
The system must display the last 5–10 transactions.
Each record must include date, type, and amount.
3.7 Transaction History
The system must record all transactions (withdrawals, deposits).
Users must be able to view full transaction history.
Non-Functional Requirements
Performance Requirements
The system must handle multiple users simultaneously.
Transactions must be processed within seconds.
Security Requirements
PIN must be encrypted in the database.
Role-based authentication must be enforced.
All sensitive data must be secured.
Usability Requirements
The system must have a simple and user-friendly interface.
Navigation must be intuitive.
Reliability Requirements
The system must ensure data consistency.
Must maintain 99.9% uptime.
Maintainability
The system must be modular and easy to update.
Logs must be maintained for debugging.
Portability
The system should run on Windows, Linux, and web platforms.
4. System Models
Context Diagram
<img src="images/context_diagram_bank_system.png" alt="Context Diagram">
Activity Diagram
<img src="images/activity_diagram_bank_system.png" alt="Activity Diagram">
Use Case Diagram
<img src="images/use_case_diagram_bank_system.png" alt="Use Case Diagram">
Sequence Diagram
<img src="images/sequence_diagram_bank_system.png" alt="Sequence Diagram">
Entity-Relationship (ER) Diagram

The ER Diagram represents relationships between Users, Accounts, and Transactions in the Bank Management System.

<img src="images/er_diagram_bank_system.png" alt="ER Diagram">
Main Entities:
User
User_ID (PK)
Name
Account_Number
PIN
Account
Account_ID (PK)
User_ID (FK)
Balance
Account_Type
Transaction
Transaction_ID (PK)
Account_ID (FK)
Type (Withdraw / Deposit)
Amount
Date_Time
Relationships:
One User → One Account
One Account → Many Transactions
State Diagram
<img src="images/erd image.png" alt="State Diagram">
5. System Evolution
Assumptions
Future mobile banking app integration is possible.
AI-based fraud detection may be added.
Multi-currency support may be introduced.
Expected Changes
Integration with online payment gateways
Biometric authentication (fingerprint/face ID)
SMS/Email notifications for transactions
6. Appendices
Hardware Requirements
Cloud or local server infrastructure
Secure database server
Backup storage system
Database Requirements
Must support relational data (SQL-based)# Your SRS
