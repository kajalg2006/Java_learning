import java.io.FileReader;
import java.io.IOException;

class G {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("golu.txt");

        char[] arr = new char[4];

        int count = fr.read(arr);
        while(count != -1) {
            for(int i=0;i<count;i++)
                System.out.print(arr[i]);

            count = fr.read(arr);
        }

        fr.close();
    }    
}