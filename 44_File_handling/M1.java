import java.io.File;
import java.io.IOException;

class M1 {
    public static void main(String[] args) throws IOException{
        File file =new File("aaa");
        file.mkdir();

        File f1 = new File("aaa/abc.txt");

        f1.createNewFile();
    }
}
