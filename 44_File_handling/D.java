import java.io.File;
class D {
    public static void main(String[] args) {
        File file = new File("A.java");
        boolean flag = file.isDirectory();
        System.out.println("Is A.java a directory?: " + flag);
    }
}
