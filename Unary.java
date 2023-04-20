public class Unary {
    public static void main(String []args) {
        // ++, --, ~, -, !
        int a = 10;
        int b = 20;
        a++;
        System.out.println("a increment: "+a);
        a--;
        System.out.println("a decrement: "+a);
        b--;
        System.out.println("b decrement: "+b);
        b++;
        System.out.println("b increment: "+b);
        int c = 5;
        int d = 15;
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("c: "+~c);
        System.out.println("d: "+-d);
        System.out.println(!bool1);
        System.out.println(!bool2);
    }
}
