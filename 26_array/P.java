public class P {
    public static void main(String[] args) {
        int[] x = {};
        int[][] y = {};
        int[][][] z = {};

        System.out.println(x instanceof int[]);
        //System.out.println(x instanceof int[][]);
        //System.out.println(x instanceof int[][][]);
        //System.out.println(x instanceof String[]);
        System.out.println("~~~~");
        //System.out.println(y instanceof int[]);
        System.out.println(y instanceof int[][]);
        //System.out.println(y instanceof int[][][]);
        //System.out.println(y instanceof String[][]);
        System.out.println("~~~~");
        //System.out.println(z instanceof int[]);
        //System.out.println(z instanceof int[][]);
        System.out.println(z instanceof int[][][]);
        //System.out.println(z instanceof String[][][]);
    }    
} 
