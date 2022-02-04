import java.util.*;
public class MaximumMinimumElement {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i;
        int max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i=1;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum element is" +max);
        min=a[0];
        for(i=1;i<5;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("minimum element is" +min);
    }

}
