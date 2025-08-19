import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class B {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("vijay.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student)ois.readObject();

            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.college);
            System.out.println(student.marks);

            ois.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}