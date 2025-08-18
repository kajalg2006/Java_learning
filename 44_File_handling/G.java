import java.io.File;

class G {
    public static void main(String[] args) {
        File file = new File("D:/movies/mohan.txt");

        
        boolean flag = file.exists();

        System.out.println("E:/movies/mohan.txt exists?: " + flag);
    }
}
