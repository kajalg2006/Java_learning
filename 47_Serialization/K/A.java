import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A {
    public static void main(String[] args) {
        // Address addr = new Address();
        XAddress addr = new XAddress();
        addr.city = "Kolkata";
        addr.state = "West Bengal";
        
        Student student = new Student();
        student.name = "Shubendu Chokraborty";
        student.age = 23;
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