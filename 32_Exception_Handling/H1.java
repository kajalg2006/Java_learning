import java.io.FileNotFoundException;
import java.io.FileReader;

public class H1 {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            int y = 12 / 0;
            FileReader r = new FileReader("golu.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("B");
    }    
}