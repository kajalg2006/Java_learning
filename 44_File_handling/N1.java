import java.io.File;
import java.io.IOException;

class N1 {
    public static void main(String[] args) throws IOException {
        File parent = new File("indraprasth");
        
        parent.mkdir();

        // File f1 = new File("indraprasth/pandavas.txt");
        // File f1 = new File(parent, "pandavas.txt");
        File f1 = new File("indraprasth", "pandavas.txt");

        f1.createNewFile();
    }
}