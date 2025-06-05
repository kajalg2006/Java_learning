import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class E1 {
    void pro() throws FileNotFoundException {

    }
}

class M extends E1 {
    // ok: throws fewer exception... hint: ClassCastException is an Unchecked Exception
    void pro() throws ClassCastException  {

    }
}