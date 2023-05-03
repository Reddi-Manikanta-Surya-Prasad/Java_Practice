import java.util.*;

public class frequencyOfDigit {
    static int freqDigit(long n, int d){
        int count = 0;
        while(n>0){
            long digit = n%10;
            if(digit == d){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit: ");
        long n = sc.nextInt();
        System.out.println("Enter a number to find the frequency: ");
        int d = sc.nextInt();
        System.out.println(freqDigit(n, d));

    }
}
