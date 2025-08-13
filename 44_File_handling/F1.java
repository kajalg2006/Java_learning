import java.io.File;

class F1 {
    public static void main(String[] args) {
        File file = new File("demo");

        String absolutePath = file.getAbsolutePath();

        System.out.println("folder demo's absolute path: " + absolutePath);
    }    
}