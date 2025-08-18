import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class D {
    public static void main(String[] args) throws IOException {
        File file = new File("aman.txt");

        FileReader fr = new FileReader(file);

        int val = 0;
        while((val = fr.read()) != -1) 
            System.out.print((char)val);        
        
        fr.close();
    }
}