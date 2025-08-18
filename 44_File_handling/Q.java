import java.io.File;

class Q {
    public static void main(String[] args) {
        File file = new File("daya.txt");

        System.out.println(file.delete());
    }
}