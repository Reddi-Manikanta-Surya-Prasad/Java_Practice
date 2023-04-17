import java.util.*;
public class prime {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true && num>=2){
            System.out.println(num +" is a Prime number.");
        }else{
            System.out.println(num +" is Not a Prime number.");
        }
    }
}
