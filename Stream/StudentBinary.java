import java.io.*;

public class StudentBinary {
    public static void main(String[] args) {
        String fileName = "students.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Aditya");
            dos.writeDouble(8.5);

            dos.writeInt(102);
            dos.writeUTF("Bublu");
            dos.writeDouble(9.2);

            dos.writeInt(103);
            dos.writeUTF("Chandan");
            dos.writeDouble(7.8);

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}