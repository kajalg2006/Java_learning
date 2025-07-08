import java.util.Arrays;

class X {
    public static void main(String[] args) {
        int[] x = {45, 78, 91, 34, 9, 12};

        for(int next : x)
            System.out.print(next + "   ");

        Arrays.sort(x);

        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        
        for(int next : x)
            System.out.print(next + "   ");

        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        // System.out.println(Arrays.binarySearch(x, 9));
        System.out.println(Arrays.binarySearch(x, 55));
    }
}
