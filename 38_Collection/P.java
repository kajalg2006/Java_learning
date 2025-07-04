public class P {
    public static void main(String[] args) {
        Employee1 x = new Employee1("hitesh", 32);
        Employee1 y = new Employee1("hitesh", 32);
        Employee1 z = new Employee1("hitesh", 32);


        // It is reflexive
        // System.out.println(x.equals(x));
        // System.out.println(y.equals(y));
        // System.out.println(z.equals(z));

        //  It is symmetric:
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));

        // It is transitive:
        // System.out.println(x.equals(y));
        // System.out.println(y.equals(z));
        // System.out.println(x.equals(z));

        // It is consistent:
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));

        // null test:
        // System.out.println(x.equals(null));
        // System.out.println(y.equals(null));
        // System.out.println(z.equals(null));
    }
}
