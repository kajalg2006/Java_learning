import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class B {
    public static void main(String[] args) throws IOException {
        File file = new File("aman.txt");
        // Type ABCD in aman.txt then try this code

        FileReader fr = new FileReader(file);

        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println((char)fr.read());
        System.out.println(fr.read());
        
        fr.close();
    }
}