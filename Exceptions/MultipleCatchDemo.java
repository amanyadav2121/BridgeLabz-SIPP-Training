package Exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int[] arr = null;
        int index = 2;

        try {
            // Uncomment to initialize the array
            // arr = new int[]{10, 20, 30};
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
