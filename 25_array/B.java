class B {    
    public static void main(String[] args) {
        int[] x = new int[0];

        System.out.println(x.length);
        System.out.println(x[0]);
    }
}



//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at B.main(B.java:6)