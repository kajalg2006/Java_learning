import java.io.File;

class L {
    public static void main(String[] args) {
        File file = new File("aaa/bbb/ccc");
        
        System.out.println("aaa/bbb/ccc exists?: " + file.exists());

        file.mkdirs();

        System.out.println("aaa/bbb/ccc exists?: " + file.exists());
    }    
}