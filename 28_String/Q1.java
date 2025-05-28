public class Q1 {
    public static void main(String[] args) {
        // String x = "My Name is: " + args[0] + " and my age is: " + args[1] + "and my marks: " + args[2];

        String x = String.format("My name is: %s and my age: %s and my marks: %s", args[0], args[1], args[2]);

        System.out.println(x);
    }    
}