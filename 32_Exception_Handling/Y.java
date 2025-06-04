import java.io.FileReader;
import java.io.FileNotFoundException;
class Y {
    Y() {
        System.out.println("A");
        // FileReader fr = new FileReader("abc.txt");
        System.out.println("B");
    }

     public static void main(String[] args) {
        System.out.println("X");
        Y y = new Y();
        System.out.println("Y");
    }    
    
}

// Y.java:6: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         FileReader fr = new FileReader("abc.txt");
//                         ^
// 1 error
