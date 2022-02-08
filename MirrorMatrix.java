 import java.util.*;
public class MirrorMatrix {
    public static void main(String[] args) {
        int i,j;
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array elements");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println(" a array elements");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("mirror matrix is");
        for(i=0;i<2;i++)
        {
            for(j=1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }


    }
}
