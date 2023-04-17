import java.util.*;
public class HCF {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        int min = 0;
        int hcf = 0;
        if(a>b){
            min = b;
        }else{
            min = a;
        }
        for(int i=2;i<min;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF of "+a+ " and "+b +" is: "+ hcf);
    }
}
