import java.io.File;

class K {
    public static void main(String[] args) {
        File file = new File("demo/indraverma");
        
        System.out.println("demo/indraverma exists?: " + file.exists());

        file.mkdir();

        System.out.println("demo/indraverma exists?: " + file.exists());
    }    
}