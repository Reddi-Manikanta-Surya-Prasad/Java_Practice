import java.util.*;
public class ArmstrongOrNot {
    public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int temp = n;
       int count = 0;
       while(temp>0){
        temp = temp/10;
        count++;
        }
        int sum = 0;
        temp = n;
       while(temp>0){
        int lastDigit = temp%10;
        sum = sum + (int)Math.pow(lastDigit, count);
        temp = temp/10;
       } 
       
       if(n == sum){
        System.out.println(n+" is an armstrong number.");
       }else{
        System.out.println(n+" is not an armstrong number.");
       }
    }
}
