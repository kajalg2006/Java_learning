import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class D1 {
    void pro() throws FileNotFoundException {

    }
}

class K extends D1 {
    //Not ok: throws wider exceptio... 
    // void pro() throws IOException  {

    // }
}

// K.java:13: error: pro() in K cannot override pro() in D1
//     void pro() throws IOException  {
//          ^
//   overridden method does not throw IOException
// 1 error