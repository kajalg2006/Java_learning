import java.util.Arrays;

class S {
    public static void main(String[] args) {
        int[] x = { 45, 78, 91, 34, 9, 12 };

        for (int next : x) {
            System.out.println(next);
        }

        Arrays.sort(x);

        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for (int next : x)
            System.out.print(next + "   ");
    }
}
