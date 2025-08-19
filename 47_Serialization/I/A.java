import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Arjun";
    student.age = 21;
    student.college = "Indraprasth College";
    student.marks = 94.44f;

    try{
        FileOutputStream fos = new FileOutputStream("vijay.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
       
        oos.writeObject(student);
        oos.close();


    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }


  }

}
