import java.io.File;

class O {
    public static void main(String[] args) {
        File file = new File("ghtotkachha");

        File dest = new File("demo");

        file.renameTo(dest);
    }
}