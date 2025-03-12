# Inventory Management System

A single-tier Java application for managing inventory, customers, and sales with role-based access control.

![Java 8](https://img.shields.io/badge/Java-8-orange)

## Overview

This inventory management system is built using Java with Swing/JFrame for the user interface and MySQL as the backend database. The application follows a single-tier architecture where all components (UI, business logic, and data access) operate within a single application.

The system provides comprehensive tools for managing products, customers, sales, and user accounts with a focus on ease of use and efficiency.

## Key Features

### Product Management
The system allows for complete control over product inventory:
- Users can add new products to the database with details like name, description, price, and initial stock quantity
- Stock levels can be increased manually when new inventory arrives
- The system automatically decreases stock quantities when products are sold
- Low stock alerts notify users when inventory reaches predefined thresholds

### Customer Management
Customer information is centralized for easy access:
- Store customer details including name, contact information, and address
- Track purchase history for each customer
- Quick search functionality to find customer records

### Sales and Invoicing
The system streamlines the sales process:
- Create new sales orders by selecting products and quantities
- The system automatically calculates totals and taxes
- Generate professional PDF invoices that can be printed or emailed
- Stock levels are automatically updated when a sale is completed

### Invoice History
Complete sales records are maintained:
- View all past invoices for any customer
- Search invoices by date range, customer name, or invoice number
- Reprint or export invoices as needed
- View sales reports and trends

### Role-Based Access Control
Security is maintained through user permissions:
- Admin users have full system access including user management
- Regular users can process sales and manage inventory
- Admin users can create new user accounts
- User accounts can be activated or deactivated without deletion for audit purposes

## System Architecture

### Single-Tier Design
The application uses a single-tier architecture where:
- The user interface (Java Swing/JFrame) directly interacts with business logic
- Business logic directly communicates with the database layer
- All components run on the same machine, simplifying deployment

### Database Structure
The MySQL database consists of several key tables:
- `products`: Stores product information and current stock levels
- `customers`: Contains customer details and contact information
- `invoices`: Stores invoice header information including date and customer ID
- `invoice_items`: Contains line items for each invoice with product and quantity
- `users`: Stores user account information with role and status flags

### UI Components
The application interface is built with Java Swing/JFrame and includes:
- Login screen with authentication
- Dashboard with summary information
- Product management screens
- Customer registration and search forms
- Sales order creation interface
- Invoice viewing and printing tools
- User management interface (admin only)

## Technical Implementation

### Data Access
- JDBC is used for database connectivity
- Prepared statements prevent SQL injection
- Connection pooling improves performance

### PDF Generation
- PDF invoices are generated using a Java PDF library
- Invoices include company details, customer information, itemized purchases, and totals
- Generated PDFs are stored for future reference

### Security Features
- Basic authentication through username and password
- Session management to prevent unauthorized access
- Input validation to prevent common security issues
- Role-based access restrictions for sensitive operations

## Benefits

- **Efficiency**: Automates inventory tracking and invoice generation
- **Accuracy**: Eliminates manual stock counting and calculation errors
- **Organization**: Centralizes customer and product information
- **Security**: Restricts access to sensitive functions based on user roles
