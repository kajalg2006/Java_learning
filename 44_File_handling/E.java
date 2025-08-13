import java.io.File;

class E {
    public static void main(String[] args) {
        File file = new File("demo");

        boolean flag = file.isDirectory();

        System.out.println("Is demo a directory?: " + flag);
    }    
}