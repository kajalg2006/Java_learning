import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class C1 {
    void pro() throws IOException {

    }
}

class J extends C1 {
    // ok: throws narrower exceptio... 
    void pro() throws FileNotFoundException, EOFException  {

    }
}