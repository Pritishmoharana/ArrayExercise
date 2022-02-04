 import java.util.*;
public class Sum {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i,j;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter five elements");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=a[i]+sum;


        }
        System.out.println("sum of all the elements is" +sum);
    }
}
