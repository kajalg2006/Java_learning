import java.io.FileNotFoundException;

class J1 {
    public static void main(String[] args) {
        try {
            //checked exception...
            FileNotFoundException x = new FileNotFoundException();
            
            throw x;
        } catch(Exception e) {

        }
    }
}