import java.util.*;

public class sample {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // int arr[] = new int[5];
      // arr[0] = 1;
      // arr[1] = 2;
      // arr[2] = 3;
      // arr[3] = 4;
      // arr[4] = 5;
      // System.out.println(arr[4]);
      // System.out.println(arr.length);

      System.out.println("Enter the size of the array: ");
      int n = sc.nextInt();
      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
         System.out.print(a[i] + " ");
      }
      double num = 34.99;
      double num2 = Math.floor(num);
      System.out.println((int)num2);
   }

}
