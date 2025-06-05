import java.io.IOException;

class X1 {
    void pro() throws IOException {

    }
}

class E extends X1 {
    // ok: throws same exceptio... 
    void pro() throws IOException {

    }
}