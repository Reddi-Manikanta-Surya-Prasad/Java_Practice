package functions;
import java.util.*;

public class function1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number a: ");
        int b = sc.nextInt();

        function1 f = new function1();
        f.sum(a,b);
    }

    public void sum(int a, int b){
        int add = a+b;
        System.out.println("Sum:"+add);
    }
}
