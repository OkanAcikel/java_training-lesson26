╔══════════════════════════════════════════════════════╗
║                 JAVA ASSIGNMENT                      ║
╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Course:
Java Software Development

Topic:
CSV Customer Management System

Difficulty:
Intermediate

Year:
2026

╠══════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a system that reads customer data from a CSV file,
modifies the data and writes the result into a new CSV file.

╠══════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Use UTF-8 encoding
• Validate all input data
• Use clean and readable code

╠══════════════════════════════════════════════════════╣

REQUIREMENTS:

CSV format:

id,name,age,city,active

Create the following components:

1. class Customer
   Attributes:
   - id
   - name
   - age
   - city
   - active

   Methods:
   - constructor
   - getters
   - toString()

2. class CsvService
   Methods:
   - List<Customer> readCustomers(String path)
   - void writeCustomers(String path, List<Customer> customers)
   - void increaseAge(List<Customer> customers)
   - List<Customer> filterActiveCustomers(List<Customer> customers)

3. class Main
   Tasks:
   - Read CSV file
   - Increase age of all customers by 1
   - Filter only active customers
   - Write result into new CSV file
   - Print all customers to console

╠══════════════════════════════════════════════════════╣

RULES:

• ID must be unique
• Age must be >= 0
• Name must not be empty
• CSV must contain a header
• Handle file errors properly

╠══════════════════════════════════════════════════════╣

BONUS:

• Sort customers by age
• Search customers by city
• Convert active field to boolean
• Handle CSV with semicolon (;)

╠══════════════════════════════════════════════════════╣

TEST IDEA:

Use a CSV file with at least 5 entries.

Steps:
1. Read CSV
2. Print original data
3. Modify data (increase age)
4. Filter active customers
5. Write new CSV
6. Print modified data

╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Java Programming Course

╚══════════════════════════════════════════════════════╝
