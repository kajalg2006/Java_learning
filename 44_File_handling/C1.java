import java.io.File;

class C1 {
    public static void main(String[] args) {
        File file = new File("demo");

        boolean flag = file.exists();

        System.out.println("demo folder exists?: " + flag);
    }    
}