class circle {
    int radius;
    float pi = 3.14f;

    void defineCircle() {
        System.out.println(
                "a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre)");
    }

    public static void main(String[] args) {
        //defineCircle();

        circle x = new circle();
        x.radius = 45;
        circle y= new circle();
        y.radius = 45;

        x.defineCircle();
        y.defineCircle();

    }

}