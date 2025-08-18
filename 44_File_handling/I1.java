import java.io.File;
import java.io.IOException;

class I1 {
    public static void main(String[] args) {
        File file = new File("demo/raju.txt");

        System.out.println(file.exists());

        boolean flag = false;
        try {            
            flag = file.createNewFile();
        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("(hint: read-only folder demo)demo/raju.txt created?: " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println(file.exists());
    }
}
