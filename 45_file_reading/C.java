import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class C{
    public static void main(String[] args) throws IOException{
        File file = new File("golu.txt");
        // write a sentence in golu.txt... 
        FileReader fr  = new FileReader(file);
        int val = fr.read();
        while(val !=-1){
          System.out.print((char)val);
            val = fr.read();
        }
        fr.close();
    }
}