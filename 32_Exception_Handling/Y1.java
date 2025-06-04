import java.io.FileReader;
import java.io.FileNotFoundException;

class Y1 {
    Y1() throws FileNotFoundException {
        System.out.println("A");
        FileReader fr = new FileReader("abc.txt");
        System.out.println("B");
    }
    
    public static void main(String[] args) {
        System.out.println("X");
        //Y1 y = new Y1();
        System.out.println("Y1");
    }    
}


// Y1.java:13: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         Y1 y = new Y1();
//                ^
// 1 error
