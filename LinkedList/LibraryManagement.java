class Book {
    int bookId;
    String title, author, genre, status;
    Book next, prev;

    Book(int bookId, String title, String author, String genre, String status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagement {
    Book head = null;
    Book tail = null;

    // Add book at beginning
    void addAtBeginning(int id, String title, String author, String genre, String status) {
        Book newBook = new Book(id, title, author, genre, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add book at end
    void addAtEnd(int id, String title, String author, String genre, String status) {
        Book newBook = new Book(id, title, author, genre, status);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add book at specific position (1-based)
    void addAtPosition(int pos, int id, String title, String author, String genre, String status) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }
        Book newBook = new Book(id, title, author, genre, status);
        Book temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) temp.next.prev = newBook;
        temp.next = newBook;
        if (newBook.next == null) tail = newBook;
    }

    // Remove book by ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found.");
            return;
        }
        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;

        System.out.println("Book ID " + id + " removed.");
    }

    // Search by title or author
    void searchBook(String keyword) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Found: " + temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.status);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book not found: " + keyword);
    }

    // Update availability status
    void updateStatus(int id, String newStatus) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.status = newStatus;
                System.out.println("Updated status for Book ID: " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    // Display books in forward direction
    void displayForward() {
        Book temp = head;
        System.out.println("Books in Library (Forward):");
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.status);
            temp = temp.next;
        }
    }

    // Display books in reverse direction
    void displayReverse() {
        Book temp = tail;
        System.out.println("Books in Library (Reverse):");
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.status);
            temp = temp.prev;
        }
    }

    // Count total books
    void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books in library: " + count);
    }

    public static void main(String[] args) {
        LibraryManagement lib = new LibraryManagement();

        lib.addAtEnd(1, "The Alchemist", "Paulo Coelho", "Fiction", "Available");
        lib.addAtBeginning(2, "Wings of Fire", "A.P.J. Abdul Kalam", "Biography", "Issued");
        lib.addAtPosition(2, 3, "1984", "George Orwell", "Dystopian", "Available");

        lib.displayForward();
        lib.displayReverse();
        lib.searchBook("George Orwell");
        lib.updateStatus(3, "Issued");
        lib.removeById(2);
        lib.countBooks();
    }
}
