import java.io.File;

class C {
    public static void main(String[] args) {
        
    
    File file = new File("golu");

        boolean flag = file.exists();

        System.out.println("golu folder exists?: " + flag);
    }
}
