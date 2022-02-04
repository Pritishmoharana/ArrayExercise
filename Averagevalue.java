 import java.util.Scanner;
public class Averagevalue {
    public static void main(String[] args) {
        int[] a=new int[5];
        int i,j;
        int sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the all elements");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/5.0;
        System.out.println("average of the elements is" +avg);


    }
}
