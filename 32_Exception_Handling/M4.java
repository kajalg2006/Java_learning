import java.io.FileReader;
import java.io.FileNotFoundException;

class M4 {
    public static void main(String[] args) throws FileNotFoundException {
            System.out.println("S");
            aaa();
            System.out.println("E");        
    }   

    static void aaa() throws FileNotFoundException {
        System.out.println("Q");
        bbb();
        System.out.println("K");
    }

    static void bbb() throws FileNotFoundException {
        System.out.println("J");
        ccc();
        System.out.println("D");
    }

    static void ccc() throws FileNotFoundException {
        System.out.println("Y");

        FileReader x = new FileReader("abc.txt");

        System.out.println("H");
    }
}
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)   
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at M4.ccc(M4.java:26)
//         at M4.bbb(M4.java:19)
//         at M4.aaa(M4.java:13)
//         at M4.main(M4.java:7)