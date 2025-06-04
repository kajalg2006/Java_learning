import java.io.FileNotFoundException;
import java.io.FileReader;
class Y2 {
    Y2() throws FileNotFoundException {
        System.out.println("A");
        FileReader fr = new FileReader("abc.txt");
        System.out.println("B");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("X");
        Y2 y = new Y2();
        System.out.println("Y2");
    }    
}

// X
// A
// Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)   
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at Y2.<init>(Y2.java:6)
//         at Y2.main(Y2.java:12)