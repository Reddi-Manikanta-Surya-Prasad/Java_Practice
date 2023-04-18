import java.util.*;
public class DiamondPattern {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
            //breaking the pattern into 2 parts --> upper_part & lower_part
            n = (n+1)/2;
            //upper pattern
            for(int i=1;i<=n;i++){
                //1.n-i spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("* ");
                }
                System.out.println();

            }

            //lower pattern
            for(int i=n-1;i>=1;i--){
                //1.n-i spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int k=1;k<=2*i-1;k++){
                    System.out.print("* ");
                }
                System.out.println();
                
            }
        
    }
}
