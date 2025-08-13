import java.io.File;

class E1 {
    public static void main(String[] args) {
        File file = new File("demo");

        boolean flag = file.isFile();

        System.out.println("Is demo a file?: " + flag);
    }    
}