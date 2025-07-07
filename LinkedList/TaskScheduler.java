class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    Task head = null;
    Task current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
            current = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newTask.next = head;
            head = newTask;
            temp.next = head;
        }
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
            current = head;
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTask;
            newTask.next = head;
        }
    }

    // Add at specific position (1-based)
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Delete task by ID
    void deleteById(int id) {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        Task temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (temp == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head.next == head) {
                        head = null;
                        current = null;
                    } else {
                        head = head.next;
                        last.next = head;
                        if (current == temp) current = head;
                    }
                } else {
                    prev.next = temp.next;
                    if (current == temp) current = temp.next;
                }
                System.out.println("Deleted Task ID: " + id);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task ID not found: " + id);
    }

    // View current task and move to next
    void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks.");
            return;
        }
        System.out.println("Current Task: " + current.id + " | " + current.name + " | Priority: " + current.priority + " | Due: " + current.dueDate);
        current = current.next;
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks in list.");
            return;
        }
        Task temp = head;
        System.out.println("All Scheduled Tasks:");
        do {
            System.out.println(temp.id + " | " + temp.name + " | Priority: " + temp.priority + " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Priority
    void searchByPriority(int targetPriority) {
        if (head == null) {
            System.out.println("No tasks.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == targetPriority) {
                System.out.println(temp.id + " | " + temp.name + " | Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No task with priority " + targetPriority);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addAtEnd(1, "Prepare PPT", 2, "2025-06-20");
        ts.addAtBeginning(2, "Write Report", 1, "2025-06-18");
        ts.addAtPosition(2, 3, "Submit Form", 3, "2025-06-22");

        ts.displayAll();

        ts.viewNextTask(); // View 1st
        ts.viewNextTask(); // View 2nd
        ts.searchByPriority(3);

        ts.deleteById(2);
        ts.displayAll();
    }
}
