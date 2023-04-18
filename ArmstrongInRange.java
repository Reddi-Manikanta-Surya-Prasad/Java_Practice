import java.util.*;
public class ArmstrongInRange {
    public static void main(String []args) {
        //calculate the armstrong numbers from m to n
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //range in outer loop from m to n
        for(int i=m;i<=n;i++){
            // need to check whether the number is armstrong number or not
            int count = 0, temp = i; 
            while(temp>0){
                count++;
                temp = temp/10;
            }
            temp = i;
            int sum = 0;
            while(temp > 0){
                int lastDigit = temp%10;
                sum = sum + (int)Math.pow(lastDigit, count);
                temp = temp/10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }
}
