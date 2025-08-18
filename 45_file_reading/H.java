import java.io.FileReader;
import java.io.IOException;

class H {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("golu.txt");

        char[] arr = new char[4];

        int count = 0;
        while((count = fr.read(arr)) != -1) {
            for(int i=0;i<count;i++)
                System.out.print(arr[i]);
        }

        fr.close();
    }    
}