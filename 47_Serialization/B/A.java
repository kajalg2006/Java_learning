import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
    public static void main(String[] args) {
        Shape x = new Shape();

        x.length = 2;
        x.width = 7;
        x.height = 12;
        File file = new File("nakul.txt");

        try{
            FileOutputStream fos= new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(x);
            oos.close();

        }catch(FileNotFoundException e){
           e.printStackTrace();
        }catch(IOException e){
           e.printStackTrace();
        } 


    }
}
