import java.util.*;
public class Create2DMatrix {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int i,j;
        System.out.println("enter array elements");

        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        System.out.println("printed matrix is");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }

    }
}
