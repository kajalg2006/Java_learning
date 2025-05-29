import java.io.FileNotFoundException;
import java.io.FileReader;

public class G1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A");
        
        FileReader r = new FileReader("golu.txt");

        System.out.println("B");
    }   
}
