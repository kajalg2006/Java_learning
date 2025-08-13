class I {
    public static void main(String[] args) {
        byte a = 34;
        int b = a;

        int[] x = new int[2];
        int[] y = new byte[2];
    }    
}



// I.java:9: error: incompatible types: byte[] cannot be converted to int[]
//         int[] y = new byte[2];
//                   ^
// 1 error