 import java.util.*;
public class Addition2Matrix {
    public static void main(String[] args) {
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] c=new int[2][2];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter b array element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("a array element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("b array element");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("sum of two matrix is");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println();
        }


    }
}
