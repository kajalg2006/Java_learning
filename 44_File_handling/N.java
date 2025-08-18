import java.io.File;
import java.io.IOException;
class N {
    public static void main(String[] args) throws IOException{
        File parent  = new File("dholakpur");

        parent.mkdir();
         // File f1 = new File("dholakpur/jaggu.txt");
        File f1 = new File(parent, "jaggu.txt");

        f1.createNewFile();
    }
}
