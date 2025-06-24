import java.util.Scanner;

public class MatrixToArrayConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        int[] flat = new int[rows * cols];
        int index = 0;
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
                flat[index++] = matrix[i][j];
            }
        }
        
        System.out.print("Flattened array: ");
        for (int num : flat) System.out.print(num + " ");
        sc.close();
    }
}