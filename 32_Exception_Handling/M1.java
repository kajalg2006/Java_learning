import java.io.FileNotFoundException;
import java.io.FileReader;

public class M1 {
    public static void main(String[] args) {
        System.out.println("S");
        aaa();
        System.out.println("E");
    }

    static void aaa() {
        System.out.println("Q");
        bbb();
        System.out.println("K");
    }

    static void bbb() {
        System.out.println("J");
        //ccc();
        System.out.println("D");
    }

     static void ccc() throws FileNotFoundException  {
        System.out.println("Y");

       FileReader x = new FileReader("abc.txt");

        System.out.println("H");
    }
}
// M1.java:19: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         ccc();
//            ^
// 1 error
