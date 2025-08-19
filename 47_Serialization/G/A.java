import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        Address addr = new Address();
        addr.city = "Jaipur";
        addr.state = "Rajasthan";
        
        Student student = new Student();
        student.name = "Vikram";
        student.age = 21;
        student.address = addr;

        try {
            FileOutputStream fos = new FileOutputStream("jay.txt");

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