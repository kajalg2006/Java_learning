import java.io.File;

class K1 {
    public static void main(String[] args) {
        File file = new File("aaa/bbb");
        
        System.out.println("aaa/bbb exists?: " + file.exists());

        file.mkdir();

        System.out.println("aaa/bbb exists?: " + file.exists());
    }    
}