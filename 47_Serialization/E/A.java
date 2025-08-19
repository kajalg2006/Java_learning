import java.io.*;

class A {
    public static void main(String[] args) throws IOException {
        Address addr = new Address();
        addr.city = "Nagpur";
        addr.state = "Maharashtra";
        
        Student student = new Student();
        student.name = "vigyan";
        student.age = 12;
        student.address = addr;

        new ObjectOutputStream(new FileOutputStream("bheem.txt")).writeObject(student);
    }
}
