class H {
    static int x = 9;

    static void pro() {

    }

    public static void main(String[] args) {

        System.out.println("main -start");

        H a = new H();
        H b = new H();
        H c = new H();

        System.out.println("main -end");
    }

    static {
        System.out.println("AAA");
    }
}
