import java.util.*;

public class consecutive {

    static int consecutivePair(int []arr, int k){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1] == k){
                count++;
            }
        }
        return count;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(consecutivePair(arr, k));
    }
}
