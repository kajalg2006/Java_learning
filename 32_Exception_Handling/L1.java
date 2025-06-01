import java.io.IOException;

class L1 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        }
        //  catch(ArithmeticException e){
        catch (IOException e) {

        }
    }
}
