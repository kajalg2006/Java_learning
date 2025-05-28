class A{
    public static void main(String[] args) {
        System.out.println("start");

        int y = 12/0;
       System.out.println(y);
        System.out.println("end");
    }
}

// start
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:5)