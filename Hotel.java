import java.util.Scanner;

class Hotel {
    public static void main(String[] args) {
        HotelRoom a = new HotelRoom(307, 4);
        HotelRoom b = new HotelRoom(205, 3);
        b.checkIn("Test Guest");
        HotelRoom c = new HotelRoom(402, 2);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println("Hotel Menu:");
        System.out.println("1 -Display rooms by room number (ascending)");
        System.out.println("2 -Check-in to a room");
        System.out.println("3 -Check-out from a room");
        System.out.println("4 -Find available room by requested beds");
        System.out.println("Enter your choice :");

        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        String guestName;
        int roomNum;
        int beds;

        switch (choice) {
            case 1:
                displaySorted(a, b, c);
                break;
            case 2:
                System.out.println("Enter room number:");
                roomNum = reader.nextInt();
                reader.nextLine();
                System.out.println("Enter guest name:");
                guestName = reader.nextLine();
                checkIn(guestName, roomNum, a, b, c);
                break;
            case 3:
                System.out.println("Enter room number:");
                roomNum = reader.nextInt();
                reader.nextLine();
                checkOut(roomNum, a, b, c);
                break;
            case 4:
                beds = reader.nextInt();
                findAvailableByBeds(beds, a, b, c);
                break;
            default:
                System.out.println("Error: Invalid menu choice");
        }
    }

    public static void displaySorted(HotelRoom a, HotelRoom b, HotelRoom c) {
        HotelRoom first;
        HotelRoom second;
        HotelRoom third;
        if (a.before(b) && a.before(c)) {
            first = a;
            if (b.before(c)) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b.before(a) && b.before(c)) {
            first = b;
            if (a.before(c)) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a.before(b)) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    public static void checkIn(String guestName, int roomNum, HotelRoom a, HotelRoom b, HotelRoom c) {
        boolean processed = false;
        if (a != null && a.getRoomNum() == roomNum && !a.isOccupied()) {
            a.checkIn(guestName);
            System.out.println(a);
            processed = true;
        } else if (b != null && b.getRoomNum() == roomNum && !b.isOccupied()) {
            b.checkIn(guestName);
            System.out.println(b);
            processed = true;
        } else if (c != null && c.getRoomNum() == roomNum && !c.isOccupied()) {
            c.checkIn(guestName);
            System.out.println(c);
            processed = true;
        }
        if (!processed) {
            System.out.println("Error: Room not available or not found");
        }
    }

    public static void checkOut(int roomNum, HotelRoom a, HotelRoom b, HotelRoom c) {
        if (a != null && a.getRoomNum() == roomNum) {
            a.checkOut();
            System.out.println(a);
        } else if (b != null && b.getRoomNum() == roomNum) {
            b.checkOut();
            System.out.println(b);
        } else if (c != null && c.getRoomNum() == roomNum) {
            c.checkOut();
            System.out.println(c);
        } else {
            System.out.println("Error: Room not available or not found");
        }
    }

    public static void findAvailableByBeds(int beds, HotelRoom a, HotelRoom b, HotelRoom c) {
        if (beds == a.getNumBeds() && !a.isOccupied()) {
            System.out.println(a);
        } else if (beds == b.getNumBeds() && !b.isOccupied()) {
            System.out.println(b);
        } else if (beds == c.getNumBeds() && !c.isOccupied()) {
            System.out.println(c);
        } else {
            System.out.println("No available room with the requested number of beds");
        }
    }

    public static void display(HotelRoom a, HotelRoom b, HotelRoom c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static HotelRoom findRoomByNumber(int roomNum, HotelRoom a, HotelRoom b, HotelRoom c) {
        if (roomNum == a.getRoomNum()) {
            return a;
        } else if (roomNum == b.getRoomNum()) {
            return b;
        } else if (roomNum == c.getRoomNum()) {
            return c;
        } else {
            return null;
        }
    }
}