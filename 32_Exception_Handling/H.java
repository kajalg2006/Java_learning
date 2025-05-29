public class H {
     public static void main(String[] args) {
        System.out.println("A");

        try {
            String input = args[0];
        } catch(ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("B");
    }    
}
