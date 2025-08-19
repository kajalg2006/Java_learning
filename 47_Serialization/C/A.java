import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        File file = new File("nakul.txt");
        
        try {
            FileInputStream fis = new FileInputStream(file);
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Shape x = (Shape)ois.readObject();

            System.out.println(x.length);
            System.out.println(x.width);
            System.out.println(x.height);
            
            ois.close();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}