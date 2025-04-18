import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        int[][] product = new int[rows][cols]; // For matrix multiplication

        // Input matrix1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();

        // Input matrix2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();

        // Addition and Subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Matrix Multiplication
        if (cols == rows) { // only square matrices will be multiplied directly
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } else {
            System.out.println("Matrix multiplication not possible with these dimensions.");
        }

        // Print Results
        System.out.println("\nAddition:");
        printMatrix(sum);
        System.out.println("Subtraction:");
        printMatrix(diff);
        if (cols == rows) {
            System.out.println("Multiplication:");
            printMatrix(product);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
