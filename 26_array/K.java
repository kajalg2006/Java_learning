class K {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
         System.out.println(args[0]);
    }
}



// [Ljava.lang.String;@13221655
// 0
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at K.main(K.java:5)