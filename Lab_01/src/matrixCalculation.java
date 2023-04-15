import java.util.Random;
public class matrixCalculation {
    public static void main(String[] args) {
        // Create a 3x4 matrix of integers
        int m = 3;
        int n = 4;
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        Random rand = new Random();
        // Set the values of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = rand.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = rand.nextInt(10) + 1;
            }
        }
        // Print the matrix to the console
        System.out.println("Matrix 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix sum:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j])+" ");
            }
            System.out.println();
        }
    }
}
