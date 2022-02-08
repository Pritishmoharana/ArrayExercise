import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a matrix element");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter b matrix element");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("a matrix ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("b matrix ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("after multiplication c matrix will be");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }
}
