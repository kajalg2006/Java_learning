class K extends RuntimeException {
    public static void main(String[] args) throws Throwable {
        Error x = new Error();
        // Exception x = new Exception();
        // Throwable x = new Throwable();
        // ArithmeticException x = new ArithmeticException();
        // K x = new K();
        // Object x = new Object();

        throw x;
    }    
}