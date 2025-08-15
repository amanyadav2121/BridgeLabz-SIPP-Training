import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeSerialization {
    private static final String FILE_NAME = "C:\\Users\\Asus\\Desktop\\employees.ser";

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "Tanya", "HR", 50000));
        employeeList.add(new Employee(102, "Rohan", "IT", 65000));
        employeeList.add(new Employee(103, "Priti", "Finance", 60000));

        serializeEmployees(employeeList);
        deserializeAndDisplayEmployees();
    }

    public static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }

    public static void deserializeAndDisplayEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employee List:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}