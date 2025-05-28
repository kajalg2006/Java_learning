public class X1 {
    public static void main(String[] args) {
        System.out.println("main start");
        
        try {
            System.out.println("A");
            int y = 12 / 0;
            System.out.println("B");
        } finally {
            System.out.println("X");
        }

        System.out.println("main end");
    }
}