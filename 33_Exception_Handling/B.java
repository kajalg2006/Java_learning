import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2{
    Y2() throws FileNotFoundException{
    FileReader fe= new FileReader("abc.txt");
   }
}
class B extends Y2{
    B() throws FileNotFoundException{
        super();
    }
public static void main(String[] args) {
       
        System.out.println("A");

       // B a = new B();

        System.out.println("B");
    }

}

// B.java:17: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         B a = new B();
//               ^
// 1 error