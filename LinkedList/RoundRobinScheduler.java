import java.util.Scanner;

class Process {
    int id, burstTime, priority, remainingTime;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    Process head = null;

    // Add process at the end
    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    // Remove process by ID
    void removeProcess(int id) {
        if (head == null) return;

        Process curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) head = curr.next;
                    if (prev != null) prev.next = curr.next;
                    else {
                        // deleting head, need to fix tail's next
                        Process tail = head;
                        while (tail.next != curr) tail = tail.next;
                        tail.next = curr.next;
                        head = curr.next;
                    }
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display current queue
    void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }
        Process temp = head;
        System.out.println("Current Process Queue:");
        do {
            System.out.println("ID: " + temp.id + " | BT: " + temp.burstTime + " | RT: " + temp.remainingTime + " | P: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Round Robin Scheduler
    void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0, totalWT = 0, totalTAT = 0, count = 0;
        Process temp = head;

        while (head != null) {
            if (temp.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, temp.remainingTime);
                System.out.println("\nExecuting Process ID: " + temp.id + " for " + execTime + " units");
                time += execTime;
                temp.remainingTime -= execTime;

                if (temp.remainingTime == 0) {
                    int tat = time;
                    int wt = tat - temp.burstTime;
                    totalTAT += tat;
                    totalWT += wt;
                    System.out.println("Process ID: " + temp.id + " completed! TAT: " + tat + ", WT: " + wt);
                    removeProcess(temp.id);
                }
            }
            temp = (temp.next != null) ? temp.next : head;
        }

        System.out.println("\nAverage Turnaround Time: " + (totalTAT / (float) countProcesses()));
        System.out.println("Average Waiting Time: " + (totalWT / (float) countProcesses()));
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        Scanner sc = new Scanner(System.in);

        scheduler.addProcess(1, 5, 1);
        scheduler.addProcess(2, 7, 2);
        scheduler.addProcess(3, 4, 3);
        scheduler.addProcess(4, 3, 1);

        scheduler.displayProcesses();

        System.out.print("\nEnter Time Quantum: ");
        int tq = sc.nextInt();

        scheduler.simulateRoundRobin(tq);
    }
}
