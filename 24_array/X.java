public class X {
    static int[] x;
    public static void main(String[] args) {
        System.out.println(x.length);
        
    }
}
// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "X.x" is null
//         at X.main(X.java:4)
