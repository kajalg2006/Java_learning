import java.io.File;

class U {
    public static void main(String[] args) {
        File file = new File("demo");

        // String[] arr = file.list();
        File[] arr = file.listFiles();

        for(File next : arr) {
            System.out.println(next);
        }
    }
}