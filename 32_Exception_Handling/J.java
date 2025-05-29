public class J {
    public static void main(String[] args) {
    try {
            //unchecked exception...
            ArithmeticException x = new ArithmeticException();
            
            throw x;
        } catch(Exception e) {

        }
    }
}
