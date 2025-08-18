import java.io.File;

class G2 {
    public static void main(String[] args) {
        File file = new File("E:\\movies\\mohan.txt");

        boolean flag = file.exists();

        System.out.println("E:/movies/mohan.txt exists?: " + flag);
    }
}