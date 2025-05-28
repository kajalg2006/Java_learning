import java.io.FileReader;
import java.io.FileNotFoundException;


// Either handle ... 
class G {
    public static void main(String[] args) {
        System.out.println("A");
        
        try {
            FileReader r = new FileReader("golu.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e + " ~~~~");
        }

        System.out.println("B");
    }    
}