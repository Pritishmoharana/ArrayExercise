 public class ReverseArray {
     public static void main(String[] args) {
         int[] a={2,4,3,5,1};
         System.out.println("enter array elements");
         for(int i=0;i<5;i++)
         {
             System.out.println(a[i] +" ");
         }
         System.out.println("after reverse");
         for(int i=4;i>=0;i--)
         {
             System.out.println(a[i] +" ");
         }
     }
}
