package Methods;

import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = createRandomMatrix(2, 3);
        int[][] B = createRandomMatrix(3, 2);
        
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        
        System.out.println("Matrix Addition (A + A):");
        printMatrix(addMatrices(A, A));
        
        System.out.println("Matrix Multiplication (A × B):");
        printMatrix(multiplyMatrices(A, B));
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int aRows = A.length;
        int aCols = A[0].length;
        int bCols = B[0].length;
        int[][] result = new int[aRows][bCols];
        
        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}