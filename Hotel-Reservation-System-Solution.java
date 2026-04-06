import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
╔════════════════════════════════════════════════════════════╗
║                 HOTEL RESERVATION SYSTEM                  ║
║                  Java Software Development                ║
║                    Instructor: Okan Acikel               ║
║                           Year: 2026                     ║
╚════════════════════════════════════════════════════════════╝
*/

class Room {
    private int number;
    private String type;
    private double price;
    private boolean occupied;

    public Room(int number, String type, double price) {
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be greater than 0.");
        }
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type must not be empty.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Room price must be positive.");
        }

        this.number = number;
        this.type = type.trim();
        this.price = price;
        this.occupied = false;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void free() {
        occupied = false;
    }

    @Override
    public String toString() {
        return "Room " + number + " | Type: " + type + " | Price: " + price + " | Occupied: " + occupied;
    }
}

class Guest {
    private String name;

    public Guest(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Guest name must not be empty.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }
}

class Reservation {
    private Guest guest;
    private Room room;
    private int nights;

    public Reservation(Guest guest, Room room, int nights) {
        if (guest == null) {
            throw new IllegalArgumentException("Guest must not be null.");
        }
        if (room == null) {
            throw new IllegalArgumentException("Room must not be null.");
        }
        if (nights <= 0) {
            throw new IllegalArgumentException("Nights must be greater than 0.");
        }

        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public double calculatePrice() {
        return room.getPrice() * nights;
    }

    @Override
    public String toString() {
        return "Guest: " + guest.getName()
                + " | Room: " + room.getNumber()
                + " | Type: " + room.getType()
                + " | Nights: " + nights
                + " | Total: " + calculatePrice();
    }
}

class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room must not be null.");
        }

        for (Room existingRoom : rooms) {
            if (existingRoom.getNumber() == room.getNumber()) {
                throw new IllegalArgumentException("Room number must be unique.");
            }
        }

        rooms.add(room);
        System.out.println("Room " + room.getNumber() + " added successfully.");
    }

    public void bookRoom(Guest guest, int roomNumber, int nights) {
        if (guest == null) {
            throw new IllegalArgumentException("Guest must not be null.");
        }
        if (nights <= 0) {
            throw new IllegalArgumentException("Nights must be greater than 0.");
        }

        Room room = findRoomByNumber(roomNumber);

        if (room == null) {
            System.out.println("Booking failed: Room " + roomNumber + " does not exist.");
            return;
        }

        if (room.isOccupied()) {
            System.out.println("Booking failed: Room " + roomNumber + " is already occupied.");
            return;
        }

        Reservation reservation = new Reservation(guest, room, nights);
        reservations.add(reservation);
        room.occupy();

        System.out.println("Booking successful: " + guest.getName() + " booked room " + roomNumber + ".");
    }

    public void cancelReservation(int roomNumber) {
        Iterator<Reservation> iterator = reservations.iterator();

        while (iterator.hasNext()) {
            Reservation reservation = iterator.next();

            if (reservation.getRoom().getNumber() == roomNumber) {
                reservation.getRoom().free();
                iterator.remove();
                System.out.println("Reservation for room " + roomNumber + " has been cancelled.");
                return;
            }
        }

        System.out.println("Cancellation failed: No reservation found for room " + roomNumber + ".");
    }

    public void printFreeRooms() {
        System.out.println("\n================ FREE ROOMS ================");
        boolean found = false;

        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println("Room " + room.getNumber()
                        + " | Type: " + room.getType()
                        + " | Price: " + room.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No free rooms available.");
        }
    }

    public void printReservations() {
        System.out.println("\n============== RESERVATIONS ==============");

        if (reservations.isEmpty()) {
            System.out.println("No reservations available.");
            return;
        }

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // BONUS METHODS
    public void searchRoomsByType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type must not be empty.");
        }

        System.out.println("\n=========== ROOMS OF TYPE: " + type.toUpperCase() + " ===========");
        boolean found = false;

        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type)) {
                System.out.println(room);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms found for type: " + type);
        }
    }

    public double calculateTotalRevenue() {
        double total = 0;

        for (Reservation reservation : reservations) {
            total += reservation.calculatePrice();
        }

        return total;
    }

    public void printOccupiedRooms() {
        System.out.println("\n============== OCCUPIED ROOMS ==============");
        boolean found = false;

        for (Room room : rooms) {
            if (room.isOccupied()) {
                System.out.println("Room " + room.getNumber()
                        + " | Type: " + room.getType()
                        + " | Price: " + room.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No occupied rooms.");
        }
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║            WELCOME TO GRAND JAVA HOTEL            ║");
        System.out.println("║           Hotel Reservation Management            ║");
        System.out.println("╚════════════════════════════════════════════════════╝");

        Hotel hotel = new Hotel();

        // Add rooms
        hotel.addRoom(new Room(101, "Single", 80.0));
        hotel.addRoom(new Room(102, "Double", 120.0));
        hotel.addRoom(new Room(103, "Suite", 250.0));
        hotel.addRoom(new Room(104, "Single", 90.0));
        hotel.addRoom(new Room(105, "Double", 140.0));

        // Create guests
        Guest guest1 = new Guest("Alice Johnson");
        Guest guest2 = new Guest("Bob Smith");

        // Book rooms
        hotel.bookRoom(guest1, 101, 3);
        hotel.bookRoom(guest2, 103, 2);

        // Print reservations
        hotel.printReservations();

        // Print free rooms
        hotel.printFreeRooms();

        // Print occupied rooms
        hotel.printOccupiedRooms();

        // Search rooms by type
        hotel.searchRoomsByType("Single");

        // Print revenue
        System.out.println("\nTotal Revenue: " + hotel.calculateTotalRevenue());

        // Cancel one reservation
        hotel.cancelReservation(101);

        // Print updated reservations
        hotel.printReservations();

        // Print free rooms again
        hotel.printFreeRooms();

        System.out.println("\nThank you for using Grand Java Hotel Reservation System.");
    }
}
