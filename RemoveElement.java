import java.util.*;
public class RemoveElement{
    public static void main(String[] args) {
        int size,loc,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        size=sc.nextInt();
        int[] a =new int[size];
        System.out.println("enter array elements");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array elements are");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println("enter the location");
        loc=sc.nextInt();
        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        System.out.println("after removing element");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+ " ");
        }

    }
}