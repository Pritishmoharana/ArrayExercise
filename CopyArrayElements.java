 import java.util.*;
public class CopyArrayElements {
    public static void main(String[] args) {
        int[] a=new int[5];
        int[] b=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st array elements");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println(" 1st array elements");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");

        }
        System.out.println(" 2nd array elements");
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]+" ");

        }




    }
}
