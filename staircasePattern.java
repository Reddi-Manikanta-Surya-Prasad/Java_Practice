import java.util.*;
public class staircasePattern {
    public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=1;i<=n;i++){
        //print (n-i) spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //print i stars
        for(int k=1;k<=i;k++){
            System.out.print("#");
        }
        System.out.println();
       } 
    }
}
