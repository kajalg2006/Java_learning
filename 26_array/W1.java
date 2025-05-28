class W1 {
    public static void main(String[] args) {
        // BB[] a = {new X1(), new X2(), new X3()};

        // -------------- OR --------

        BB[] a = new BB[3];

        a[0] = new X1();
        a[1] = new X2();
        a[2] = new X3();
    }
}

interface BB {
}

class X1 implements BB {
}

class X2 implements BB {
}

class X3 implements BB {
}
