import java.io.FileNotFoundException;
import java.io.IOException;

class B1 {
    void pro() throws IOException {

    }
}

class I extends B1 {
    // ok: throws narrower exceptio... 
    void pro() throws FileNotFoundException  {

    }
}