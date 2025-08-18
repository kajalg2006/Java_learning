import java.io.File;

class R {
    public static void main(String[] args) {
        File file = new File("demo");

        System.out.println(file.delete());
    }
}