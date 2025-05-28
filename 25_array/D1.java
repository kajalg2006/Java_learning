class D1 {
    public static void main(String[] args) {
        char a = 'B';
        byte b = 34;
        short c = 89;
        int d = 102;
        long e = 899L;
        float f = 7.8f;
        double g = 88.9;

        int[] arr = { a, b, c, d, (int) e, (int) f, (int) g };
        for(int next : arr)
        System.out.println(next); 
    }
}
