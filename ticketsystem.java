/*
╔══════════════════════════════════════════════════════════════════╗
║                    SUDO IT SOLUTIONS                            ║
║               JAVA DEVELOPER PRACTICE ASSIGNMENT                ║
╠══════════════════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Company:
Sudo IT Solutions

Course:
Java Software Development

Topic:
IT Service Desk & Ticket Management System

Difficulty:
Intermediate to Advanced

Year:
2026

╠══════════════════════════════════════════════════════════════════╣

COMPANY SCENARIO:

Sudo IT Solutions is a Systemhaus that supports business
customers in infrastructure, client management, server
administration, Microsoft environments, network support
and helpdesk operations.

Every day, support requests are received from customers.
These requests must be documented as tickets, assigned
to available administrators and closed after completion.

Your task is to build a simplified but realistic internal
ticket system used by Sudo IT Solutions.

╠══════════════════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a practical IT service desk system for
Sudo IT Solutions.

The system should manage:
- customers
- managed devices
- system administrators
- support tickets
- ticket assignment workflow

╠══════════════════════════════════════════════════════════════════╣

REALISTIC EXAMPLES FROM DAILY BUSINESS:

- Customer cannot access company VPN
- Windows Server backup failed overnight
- Firewall site-to-site connection is down
- New employee needs notebook setup
- Printer in accounting is offline
- Microsoft 365 login issue
- Fileshare permissions are missing
- User account needs password reset

╠══════════════════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Write clean and readable code
• Validate all input values
• Use meaningful console output
• Follow the business rules exactly

╠══════════════════════════════════════════════════════════════════╣

REQUIREMENTS:

Create the following components:

1. class Customer
   Attributes:
   - companyName
   - contactPerson
   - customerId

   Methods:
   - constructor
   - getters
   - toString()

2. class Device
   Attributes:
   - assetId
   - deviceType
   - hostname
   - customer
   - online

   Methods:
   - constructor
   - getters
   - isOnline()
   - setOnline(boolean online)
   - toString()

3. class Admin
   Attributes:
   - name
   - specialization
   - available

   Methods:
   - constructor
   - getters
   - isAvailable()
   - setAvailable(boolean available)
   - toString()

4. class Ticket
   Attributes:
   - id
   - title
   - description
   - priority
   - customer
   - device
   - assignedAdmin
   - open

   Methods:
   - constructor
   - getters
   - assignAdmin(Admin admin)
   - closeTicket()
   - toString()

5. class SudoITServiceDesk
   Attributes:
   - List<Customer> customers
   - List<Device> devices
   - List<Admin> admins
   - List<Ticket> tickets

   Methods:
   - addCustomer(Customer customer)
   - addDevice(Device device)
   - addAdmin(Admin admin)
   - createTicket(Ticket ticket)
   - assignTicket(int ticketId, String adminName)
   - closeTicket(int ticketId)
   - printAllTickets()
   - printOpenTickets()
   - printAvailableAdmins()
   - printOfflineDevices()
   - printCustomerDevices(String customerId)

╠══════════════════════════════════════════════════════════════════╣

BUSINESS RULES:

• customerId must be unique
• assetId must be unique
• ticketId must be unique
• companyName must not be empty
• contactPerson must not be empty
• admin name must not be empty
• specialization must not be empty
• device must belong to a customer
• ticket title must not be empty
• ticket description must not be empty
• customer must not be null
• device must not be null
• ticket cannot be assigned twice
• closed ticket cannot be assigned again
• admin must be available before assignment
• when a ticket is assigned, the admin becomes unavailable
• when a ticket is closed, the admin becomes available again

╠══════════════════════════════════════════════════════════════════╣

BONUS TASKS:

• searchTicketsByPriority(String priority)
• searchTicketsByCustomer(String customerId)
• printClosedTickets()
• countOpenTickets()
• countOfflineDevices()
• use enums for:
  - DeviceType
  - Priority
  - Specialization

╠══════════════════════════════════════════════════════════════════╣

TEST SCENARIO:

Create a realistic test scenario for Sudo IT Solutions:

Customers:
- Meyer GmbH
- Schulz Logistics
- Alpha Medics

Devices:
- firewall
- notebook
- server
- switch
- printer

Admins:
- network admin
- windows admin
- helpdesk admin

Tickets:
- VPN issue
- backup failed
- notebook setup
- printer offline
- login problem

Then:
1. create all objects
2. assign multiple tickets
3. print all tickets
4. print open tickets
5. print offline devices
6. print available admins
7. close one or more tickets
8. print the updated result

╠══════════════════════════════════════════════════════════════════╣

DELIVERABLE:

Your program should simulate a small internal support tool
that could realistically be used by Sudo IT Solutions for
daily service desk operations.

╠══════════════════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Sudo IT Solutions
Java Developer Training

╚══════════════════════════════════════════════════════════════════╝
*/

import java.util.ArrayList;
import java.util.List;

class Customer {

    // TODO:
    // Define all required attributes

    public Customer(String customerId, String companyName, String contactPerson) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getCustomerId() {
        // TODO:
        return null;
    }

    public String getCompanyName() {
        // TODO:
        return null;
    }

    public String getContactPerson() {
        // TODO:
        return null;
    }

    @Override
    public String toString() {
        // TODO:
        return null;
    }
}

class Device {

    // TODO:
    // Define all required attributes

    public Device(String assetId, String deviceType, String hostname, Customer customer, boolean online) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getAssetId() {
        // TODO:
        return null;
    }

    public String getDeviceType() {
        // TODO:
        return null;
    }

    public String getHostname() {
        // TODO:
        return null;
    }

    public Customer getCustomer() {
        // TODO:
        return null;
    }

    public boolean isOnline() {
        // TODO:
        return false;
    }

    public void setOnline(boolean online) {
        // TODO:
    }

    @Override
    public String toString() {
        // TODO:
        return null;
    }
}

class Admin {

    // TODO:
    // Define all required attributes

    public Admin(String name, String specialization) {
        // TODO:
        // Validate input
        // Initialize attributes
        // Admin is available by default
    }

    public String getName() {
        // TODO:
        return null;
    }

    public String getSpecialization() {
        // TODO:
        return null;
    }

    public boolean isAvailable() {
        // TODO:
        return false;
    }

    public void setAvailable(boolean available) {
        // TODO:
    }

    @Override
    public String toString() {
        // TODO:
        return null;
    }
}

class Ticket {

    // TODO:
    // Define all required attributes

    public Ticket(int id, String title, String description, String priority, Customer customer, Device device) {
        // TODO:
        // Validate input
        // Initialize attributes
        // Ticket is open by default
        // assignedAdmin is null by default
    }

    public int getId() {
        // TODO:
        return 0;
    }

    public String getTitle() {
        // TODO:
        return null;
    }

    public String getDescription() {
        // TODO:
        return null;
    }

    public String getPriority() {
        // TODO:
        return null;
    }

    public Customer getCustomer() {
        // TODO:
        return null;
    }

    public Device getDevice() {
        // TODO:
        return null;
    }

    public Admin getAssignedAdmin() {
        // TODO:
        return null;
    }

    public boolean isOpen() {
        // TODO:
        return false;
    }

    public void assignAdmin(Admin admin) {
        // TODO:
        // Validate admin
        // Check if ticket is open
        // Check if ticket is already assigned
        // Check if admin is available
        // Assign admin
        // Set admin to unavailable
    }

    public void closeTicket() {
        // TODO:
        // Close ticket
        // Set assigned admin to available again if present
    }

    @Override
    public String toString() {
        // TODO:
        // Return readable ticket information
        return null;
    }
}

class SudoITServiceDesk {

    // TODO:
    // Define all required lists

    public SudoITServiceDesk() {
        // TODO:
        // Initialize all lists
    }

    public void addCustomer(Customer customer) {
        // TODO:
        // Validate input
        // customerId must be unique
        // Add customer
    }

    public void addDevice(Device device) {
        // TODO:
        // Validate input
        // assetId must be unique
        // Add device
    }

    public void addAdmin(Admin admin) {
        // TODO:
        // Validate input
        // Add admin
    }

    public void createTicket(Ticket ticket) {
        // TODO:
        // Validate input
        // ticketId must be unique
        // Add ticket
    }

    public void assignTicket(int ticketId, String adminName) {
        // TODO:
        // Find ticket by ID
        // Find admin by name
        // Assign ticket
    }

    public void closeTicket(int ticketId) {
        // TODO:
        // Find ticket by ID
        // Close ticket
    }

    public void printAllTickets() {
        // TODO:
        // Print all tickets
    }

    public void printOpenTickets() {
        // TODO:
        // Print only open tickets
    }

    public void printAvailableAdmins() {
        // TODO:
        // Print available admins
    }

    public void printOfflineDevices() {
        // TODO:
        // Print devices with online == false
    }

    public void printCustomerDevices(String customerId) {
        // TODO:
        // Print all devices of one customer
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        TODO:
        Create a realistic Sudo IT Solutions scenario:

        1. Create the service desk system
        2. Add at least 3 customers
        3. Add multiple devices for each customer
        4. Add at least 3 admins with different specializations
        5. Create at least 5 tickets
        6. Assign tickets to admins
        7. Print all tickets
        8. Print open tickets
        9. Print offline devices
        10. Print available admins
        11. Close one ticket
        12. Print updated ticket overview
        */
    }
}
