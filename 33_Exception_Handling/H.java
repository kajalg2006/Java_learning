import java.io.FileNotFoundException;
import java.io.EOFException;

class A1 {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class H extends A1 {
    // ok: throws fewer exceptio... 
    void pro() throws FileNotFoundException  {

    }
}