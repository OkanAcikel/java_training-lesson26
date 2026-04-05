/*
╔══════════════════════════════════════════════════════╗
║                 JAVA ASSIGNMENT                      ║
╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Course:
Java Software Development

Topic:
Hotel Reservation System

Difficulty:
Intermediate to Advanced

Year:
2026

╠══════════════════════════════════════════════════════╣

OBJECTIVE:

Implement a hotel reservation system with rooms, guests,
reservations and booking logic.

╠══════════════════════════════════════════════════════╣

INSTRUCTIONS:

• Implement all TODO sections
• Do not modify method signatures
• Write clean and readable code
• Validate input data

╠══════════════════════════════════════════════════════╣

REQUIREMENTS:

Create the following components:

1. class Room
   Attributes:
   - number
   - type
   - price
   - occupied

   Methods:
   - constructor
   - getters
   - occupy()
   - free()

2. class Guest
   Attributes:
   - name

3. class Reservation
   Attributes:
   - guest
   - room
   - nights

   Methods:
   - constructor
   - calculatePrice()

4. class Hotel
   Attributes:
   - List<Room> rooms
   - List<Reservation> reservations

   Methods:
   - addRoom(Room room)
   - bookRoom(Guest guest, int roomNumber, int nights)
   - cancelReservation(int roomNumber)
   - printFreeRooms()
   - printReservations()

╠══════════════════════════════════════════════════════╣

RULES:

• Room number must be unique
• Room must not be booked twice at the same time
• Nights must be greater than 0
• Guest must not be null
• Room price must be positive

╠══════════════════════════════════════════════════════╣

BONUS:

• searchRoomsByType(String type)
• calculateTotalRevenue()
• printOccupiedRooms()
• add room categories using enum

╠══════════════════════════════════════════════════════╣

TEST IDEA:

Create several rooms and guests.
Book rooms.
Print free rooms.
Cancel one reservation.
Print reservations before and after cancellation.

╠══════════════════════════════════════════════════════╣

Instructor:
Okan Acikel

Java Programming Course

╚══════════════════════════════════════════════════════╝
*/

class Room {

    // TODO:
    // Define all required attributes

    public Room(int number, String type, double price) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public int getNumber() {
        // TODO:
        return 0;
    }

    public String getType() {
        // TODO:
        return null;
    }

    public double getPrice() {
        // TODO:
        return 0;
    }

    public boolean isOccupied() {
        // TODO:
        return false;
    }

    public void occupy() {
        // TODO:
        // Mark room as occupied
    }

    public void free() {
        // TODO:
        // Mark room as free
    }
}

class Guest {

    // TODO:
    // Define required attributes

    public Guest(String name) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public String getName() {
        // TODO:
        return null;
    }
}

class Reservation {

    // TODO:
    // Define all required attributes

    public Reservation(Guest guest, Room room, int nights) {
        // TODO:
        // Validate input
        // Initialize attributes
    }

    public Guest getGuest() {
        // TODO:
        return null;
    }

    public Room getRoom() {
        // TODO:
        return null;
    }

    public int getNights() {
        // TODO:
        return 0;
    }

    public double calculatePrice() {
        // TODO:
        // Calculate reservation price
        return 0;
    }

    @Override
    public String toString() {
        // TODO:
        // Return a readable reservation string
        return null;
    }
}

class Hotel {

    // TODO:
    // Define room list and reservation list

    public void addRoom(Room room) {
        // TODO:
        // Add a room to the hotel
    }

    public void bookRoom(Guest guest, int roomNumber, int nights) {
        // TODO:
        // Find room by number
        // Check if free
        // Create reservation
        // Mark room as occupied
    }

    public void cancelReservation(int roomNumber) {
        // TODO:
        // Cancel reservation for room number
        // Mark room as free again
    }

    public void printFreeRooms() {
        // TODO:
        // Print all rooms that are not occupied
    }

    public void printReservations() {
        // TODO:
        // Print all reservations
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        TODO:
        1. Create a Hotel object
        2. Add multiple rooms
        3. Create at least 2 guests
        4. Book some rooms
        5. Print all reservations
        6. Print free rooms
        7. Cancel one reservation
        8. Print updated reservations
        */
    }
}
