import java.io.FileNotFoundException;
import java.io.FileReader;

public class M2 {
     public static void main(String[] args) {
        System.out.println("S");
        aaa();
        System.out.println("E");
    }

    static void aaa() {
        System.out.println("Q");
        //bbb();
        System.out.println("K");
    }

    static void bbb() throws FileNotFoundException  {
        System.out.println("J");
        ccc();
        System.out.println("D");
    }

     static void ccc() throws FileNotFoundException  {
        System.out.println("Y");

       FileReader x = new FileReader("abc.txt");

        System.out.println("H");
    }
}
// M2.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         bbb();
//            ^
// 1 error