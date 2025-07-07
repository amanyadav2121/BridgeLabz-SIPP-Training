// Shivangi Tomar – Online Ticket Reservation using Circular Linked List

class Ticket {
    int ticketID;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int id, String cname, String mname, int seat, String time) {
        ticketID = id;
        customerName = cname;
        movieName = mname;
        seatNumber = seat;
        bookingTime = time;
        next = null;
    }
}

class TicketReservationSystem {
    Ticket head = null;

    void addTicket(int id, String cname, String mname, int seat, String time) {
        Ticket newTicket = new Ticket(id, cname, mname, seat, time);
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
        System.out.println("Ticket booked for " + cname);
    }

    void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket curr = head, prev = null;
        boolean found = false;

        do {
            if (curr.ticketID == id) {
                found = true;
                break;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Ticket ID not found.");
            return;
        }

        if (curr == head && curr.next == head) {
            head = null;
        } else if (curr == head) {
            Ticket temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        } else {
            prev.next = curr.next;
        }

        System.out.println("Ticket with ID " + id + " cancelled.");
    }

    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        System.out.println("Current Ticket Bookings:");
        do {
            System.out.println("ID: " + temp.ticketID + ", Name: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchTicket(String name) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name) || temp.movieName.equalsIgnoreCase(name)) {
                System.out.println("Ticket Found → ID: " + temp.ticketID + ", Name: " + temp.customerName + ", Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for: " + name);
        }
    }

    void countTickets() {
        if (head == null) {
            System.out.println("Total tickets booked: 0");
            return;
        }

        Ticket temp = head;
        int count = 0;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets booked: " + count);
    }
}

public class TicketReservationApp {
    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();

        trs.addTicket(101, "Ravi", "Pathaan", 1, "7:30 PM");
        trs.addTicket(102, "Shivangi", "Jawan", 2, "8:00 PM");
        trs.addTicket(103, "Aryan", "RRR", 3, "9:00 PM");

        trs.displayTickets();

        trs.searchTicket("Jawan");
        trs.removeTicket(102);

        trs.displayTickets();

        trs.countTickets();
    }
}
