//package functions;
import java.util.*;
//Given n and r, your task is to calculate nCr.
//Here nCr is the total number of ways for selecting r elements out of n options are 
//nCr = (n!) / (r! * (n-r)!) where n! = 1 * 2 * . . . * n.
public class factorialProblem {
    static long calculate_nCr(int n, int r){
        long nFact = factorial(n);
        long rFact = factorial(r);
        long nrFact = factorial(n-r);
        long nCr = nFact / (rFact * nrFact);
        return nCr;
    }
    static long factorial(int n){
        long fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.println(ans);

    }
}
