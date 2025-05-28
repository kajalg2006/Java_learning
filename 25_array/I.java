public class I {

    public static void main(String[] args) {
        int[] x = { 45, 62, 97, 23, 41, 22, 81, 16 };

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0)
                System.out.println(x[i]);
        }
    }
}
