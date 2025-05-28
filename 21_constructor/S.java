class shape {
    int w;
    int h;
    int l;
}

class S {
    public static void main(String[] args) {
        shape a = new shape();
        a.l = 5;

        shape b = new shape();
        b.l = 8;
        b.h= 9;

        shape c = new shape();
        c.l = 8;
        c.h = 9;
        c.w = 89;
    }
}
