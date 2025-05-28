
class Circle2 {
    int radius;
    static float pi = 3.14f;

    static void defineCircle() {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)");
    }

    void calcArea() {
        System.out.println(pi * radius * radius);
    }

    public static void main(String[] args) {           

        Circle2 x = new Circle2();
        x.radius = 45;

        Circle2 y = new Circle2();
        y.radius = 78;

        x.calcArea();
        y.calcArea();
    }
}
