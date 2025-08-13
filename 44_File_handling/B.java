import java.io.File;

class B {
    public static void main(String[] args) {
     File file = new File("abc.txt");

     boolean flag = file.exists();
     System.out.println("abc.txt exists?: " + flag);

    }
}
