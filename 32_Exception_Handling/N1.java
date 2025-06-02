import java.io.FileReader;
import java.io.FileNotFoundException;

class N1 {
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
        try {
            ccc();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("D");
    }

    static void ccc() throws FileNotFoundException {
        System.out.println("Y");

        FileReader x = new FileReader("abc.txt");        

        System.out.println("H");
    }
}