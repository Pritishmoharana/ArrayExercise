public class Sortarray {
    public static void main(String[] args) {
        int[] a = {12, 54, 56, 32, 86};
        int temp;
        System.out.println("the elements before sorting");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j]=temp;
                }


            }
        }
        System.out.println("elements after sorting");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}