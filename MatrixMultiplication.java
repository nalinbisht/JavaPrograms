import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns in matrix a: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        System.out.println("Enter no. of rows and columns in matrix b: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        int a[][] = new int[rows1][cols1];
        int b[][] = new int[rows2][cols2];

        if(cols1 != rows2){
            System.out.println("Matrix Multiplication is not possible.");
        }

        else {
            System.out.println("Enter values of matrix a: ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    a[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            System.out.println("Enter values of matrix b: ");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    b[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            //multiplication of matrices
            int c[][] = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Result: ");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            } //for loop i
        } //else loop closed
    }
}