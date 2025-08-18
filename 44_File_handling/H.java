import java.io.File;
import java.io.IOException;

class H {
    public static void main(String[] args) {
        File file  = new File("abc.txt");
        System.out.println(file.exists());

        boolean flag = false;

        try{
            flag = file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println("abc.txt created?: " + flag);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        System.out.println(file.exists());
    }
}
