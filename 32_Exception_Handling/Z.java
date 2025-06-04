import java.io.FileReader;
class Y2 {
    Y2() {
        // FileReader fr = new FileReader("abc.txt");
    }
}
class Z extends Y2 {
    Z() {

    }
    
    public static void main(String[] args) {
        System.out.println("A");

        Z a = new Z();

        System.out.println("B");
    }
}
// Z.java:4: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error