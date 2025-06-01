import java.io.FileReader;
import java.io.FileNotFoundException;
class M {
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
        ccc();
        System.out.println("D");
    }

     static void ccc()  {
        System.out.println("Y");

       // FileReader x = new FileReader("abc.txt");

        System.out.println("H");
    }
}

// M.java:25: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader x = new FileReader("abc.txt");
//                        ^
// 1 error
