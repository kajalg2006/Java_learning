import java.io.File;

class P {
    public static void main(String[] args) {
        File file = new File("gopal.txt");

        File dest = new File("E:/movies/daya.txt");

        System.out.println(file.renameTo(dest));
    }
}