import java.io.IOException;

class Y1 {
    void pro() throws IOException {

    }
}

class F extends Y1 {
    // ok: throws fewer exceptio... 
    void pro()  {

    }
}