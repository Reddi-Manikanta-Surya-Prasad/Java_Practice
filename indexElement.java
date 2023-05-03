import java.util.*;

public class indexElement {
   public static void IndexOfElement(int N, int X, int[] arr){
        //You are given an integer array Arr of size N and a number X. 
        //You need to print all the indexes of the given X in the array, else print -1.
        // Note : You have to give output in 1-based indexing.
		boolean flag = false;
		for(int i=0;i<N;i++){
			if(arr[i] == X){
				flag = true;
				System.out.print((i+1)+" ");
			}
    }
	   if(flag == false){
			System.out.print(-1);
		}
   }
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[]=new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        IndexOfElement(N,X,arr);
    }
}

