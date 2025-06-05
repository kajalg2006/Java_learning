import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class E1 {
    void pro() throws FileNotFoundException {

    }
}

class E2 extends E1 {
    // ok: throws newer exception... 
    // void pro() throws ClassNotFoundException  {

    // }
}


// L.java:13: error: pro() in E2 cannot override pro() in E1
//     void pro() throws ClassNotFoundException  {
//          ^
//   overridden method does not throw ClassNotFoundException
// 1 error