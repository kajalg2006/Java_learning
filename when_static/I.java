class circle1 {
    int radius;
    static float pi = 3.14f;

    static void defineCircle() {
        System.out.println(
                "a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)");
    }

    public static void main(String[] args) {
        //defineCircle();

        circle1 x = new circle1();
        x.radius = 45;
        circle1 y= new circle1();
        y.radius = 45;

       // x.defineCircle();
       // y.defineCircle();

    }

}