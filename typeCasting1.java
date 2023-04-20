public class typeCasting1 {
    public static void main(String []args) {
        //implicit type casting or Widening type casting
        float f = 12.54f;
        double d = f;
        System.out.println(d);

        // explicit type casting or Narrowing type casting

        double d2 = 166.66;
        long l = (long)d2;
        System.out.println(d2);
        System.out.println(l);

        

    }
}
