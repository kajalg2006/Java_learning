class E {
    public static void main(String[] args) {
        int[] x = new int[11];

        System.out.println(x.length);

        // x.length = 4;

        System.out.println(x.length);
    }
}

// E.java:7: error: cannot assign a value to final variable length
// x.length = 4;
// ^
// 1 error
