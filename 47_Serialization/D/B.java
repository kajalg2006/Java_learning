import java.io.*;

class B {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Student x = (Student)(new ObjectInputStream(new FileInputStream("bheem.txt")).readObject());

        System.out.println(x.name);
        System.out.println(x.age);
        System.out.println(x.address.city);
        System.out.println(x.address.state);
    }
}