class shape {
    int w;
    int h;
    int l;

    shape(int l) {
        this.l = l;
    }

    shape(int l, int h) {
        this.l = l;
        this.h = h;

    }

    shape(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}

class S1 {
    public static void main(String[] args) {
        shape a = new shape(2);
        //a.l = 5;

        shape b = new shape(2,4);
        // b.l = 8;
        // b.h = 9;

        shape c = new shape(2,5,6);
        // c.l = 8;
        // c.h = 9;
        // c.w = 89;
        
    }
}
