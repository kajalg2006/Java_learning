import java.io.FileNotFoundException;
import java.io.EOFException;

class Z1 {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class G extends Z1 {
    // ok: throws same exceptio... 
    void pro() throws FileNotFoundException, EOFException  {

    }
}