import java.util.*;
public class tempInFarehnheit{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double tempToFahrenheit = C * 1.8 + 32;
        System.out.printf("%.6f", tempToFahrenheit);

    }
}