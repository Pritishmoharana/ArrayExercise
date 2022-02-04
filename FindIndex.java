 import java.util.*;
public class FindIndex {
    public static void main(String[] args) {
        int i,n,count=0;
        int[] a=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element at which we can find index");
        n=sc.nextInt();
        for(i=0;i<3;i++)
        {
            if(a[i]==n)
            {
                System.out.println("index is "+i);
            }
        }

    }
}
