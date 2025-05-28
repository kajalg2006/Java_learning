class Shape{
    int w;
    int h;
    int l;

    Shape(int l) {
        this.l = l;
    }

    Shape(int l, int h) {
        this.l = l;
        this.h = h;

    }

    Shape(int l, int h, int w) {
        this(l,h);
        // this.h = h;
        // this.w = w;
        this.w=w;
    }
}
class U {
    public static void main(String[] args) {
        
        Shape x = new Shape(3);

        
        Shape y = new Shape(8,10);
        Shape z = new Shape(8,10,40);
    }
}
