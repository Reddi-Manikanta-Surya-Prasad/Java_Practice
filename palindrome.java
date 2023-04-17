import java.util.*;
public class palindrome {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            rev = rev*10+rem;
            n = n/10;
        }
        if(num == rev){
            System.out.println(num+" is a Palindrome number.");
        }else{
            System.out.println(num+" is not a Palindrome number.");
        }
    }
}
