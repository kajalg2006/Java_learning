import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

class J {
    public static void main(String[] args) throws IOException {
        File file = new File("mohan.txt");
        // mohan.txt contains 3 lines of text
        
        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);
        
        String nextLine = br.readLine();
        while(nextLine != null) {
            System.out.println(nextLine);
            nextLine = br.readLine();
        }

        br.close();
    }
}