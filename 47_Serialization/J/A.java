import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        
        Student student = new Student();
        student.name = "Bheem";
        student.age = 23;
        student.college = "Indraprasth College";
        student.marks = 79.56f;

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