class F1 {
    void pro() throws ArrayIndexOutOfBoundsException {

    }
}

class N extends F1 {
    // ok: ignore... hint: IndexOutOfBoundsException is an Unchecked Exception
    void pro() throws IndexOutOfBoundsException  {

    }
}