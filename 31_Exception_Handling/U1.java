 class U1 {
    static {
        System.out.println("A");
        int y = 12 / 0;
        System.out.println("B");
    }
    
    public static void main(String[] args) {        
        System.out.println("Hi");
    }    
}


// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at U1.<clinit>(U1.java:4)