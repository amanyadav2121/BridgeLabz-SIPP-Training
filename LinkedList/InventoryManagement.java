class Item {
    int id;
    String name;
    int quantity;
    double price;
    Item next;

    Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagement {
    Item head = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add at end
    void addAtEnd(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add at specific position (1-based)
    void addAtPosition(int pos, int id, String name, int quantity, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, quantity, price);
            return;
        }
        Item newItem = new Item(id, name, quantity, price);
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Delete by ID
    void deleteById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Deleted Item ID: " + id);
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item ID not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted Item ID: " + id);
        }
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                System.out.println("Updated quantity for Item ID: " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search by ID or Name
    void searchItem(String keyword) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (String.valueOf(temp.id).equals(keyword) || temp.name.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.id + " | " + temp.name + " | Qty: " + temp.quantity + " | Price: " + temp.price);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Item not found: " + keyword);
        }
    }

    // Total inventory value
    void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Display items
    void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory Items:");
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.id + " | " + temp.name + " | Qty: " + temp.quantity + " | Price: ₹" + temp.price);
            temp = temp.next;
        }
    }

    // Sort by price ascending
    void sortByPriceAsc() {
        if (head == null || head.next == null) return;
        for (Item i = head; i.next != null; i = i.next) {
            for (Item j = i.next; j != null; j = j.next) {
                if (i.price > j.price) {
                    // swap contents
                    double tp = i.price; i.price = j.price; j.price = tp;
                    int tq = i.quantity; i.quantity = j.quantity; j.quantity = tq;
                    int ti = i.id; i.id = j.id; j.id = ti;
                    String tn = i.name; i.name = j.name; j.name = tn;
                }
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();

        im.addAtEnd(101, "Pen", 50, 5.0);
        im.addAtBeginning(102, "Notebook", 30, 25.0);
        im.addAtPosition(2, 103, "Pencil", 100, 2.0);

        im.displayAll();
        im.totalValue();
        im.updateQuantity(103, 120);
        im.searchItem("Notebook");
        im.deleteById(102);
        im.sortByPriceAsc();
        System.out.println("\nAfter Sorting by Price:");
        im.displayAll();
    }
}
