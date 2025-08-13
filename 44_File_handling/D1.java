import java.io.File;
class D1 {
    public static void main(String[] args) {
        File file = new File("A.java");
        boolean flag = file.isFile();
        System.out.println("Is A.java  File?: " + flag);
    }
}