 import java.util.*;
public class SearchElement {
    public static void main(String[] args) {
        int[] a=new int[6];
        int i,j,n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter searching elements");
        n=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("item found" +count+ "times");
        }
        else
        {
            System.out.println("item not found");
        }
    }
}
