class V {
    {
        System.out.println("A");
        int y = 12 / 0;
        System.out.println("B");
    }
    
    public static void main(String[] args) {        
        System.out.println("main start");

        V v = new V();

        System.out.println("main end");
    }    
}

// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at V.<init>(V.java:4)
//         at V.main(V.java:11)