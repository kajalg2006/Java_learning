import java.io.FileReader;
import java.io.FileNotFoundException;

class N {
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

        try {
            FileReader x = new FileReader("abc.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("H");
    }
}