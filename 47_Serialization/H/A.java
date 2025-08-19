import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A{
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Mukund";        
        student.age = 18;
        student.college = "JEC";
        student.marks = 92.34f;


        
        try {
            FileOutputStream fos = new FileOutputStream("vijay.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}