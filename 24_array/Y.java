public class Y {
    static int[] x = {10,20,30};

    public static void main(String[] args) {
        System.out.println(x[3]);
    }
}
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at Y.main(Y.java:5)
