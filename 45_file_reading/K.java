import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

class K {
    public static void main(String[] args) throws IOException {
        File file = new File("mohan.txt");
        // mohan.txt contains 3 lines of text
        
        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);
        
        String nextLine = null;
        while((nextLine = br.readLine()) != null) 
            System.out.println(nextLine);        

        br.close();
    }
}