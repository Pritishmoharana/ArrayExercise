import java.util.*;
public class ArrayLength {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i;
        System.out.println("enter array elements");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
       /* System.out.println("the array elements are");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i] + " ");
        }*/
        System.out.println("array length is"+a.length);
    }
}
