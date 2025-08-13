import java.io.File;

class F{
    public static void main(String[] args) {
         File file = new File("A.java");

         String absolutePath= file.getAbsolutePath();

          System.out.println("A.java's absolute path: " + absolutePath);
    }
}