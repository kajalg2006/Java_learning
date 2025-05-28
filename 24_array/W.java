public class W {
    static int[] x;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(x[0]);
    }
}
// null
// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "W.x" is null
//         at W.main(W.java:5)