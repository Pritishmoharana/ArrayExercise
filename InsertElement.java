 import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        int size,i,loc,element;
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int[] a=new int[size+1];
        System.out.println("enter the array elements");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("the array elements are");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("enter the location at which wew want to add element");
        loc=sc.nextInt();
        System.out.println("enter the new element");
        element=sc.nextInt();
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=element;
        size++;
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }





    }
}
