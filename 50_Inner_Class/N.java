class N {
    private static void info() {
        System.out.println("Some info -------");
    }

    class A {
        private static void pro() {
            info();
        }
    }

    public static void main(String[] args) {
        A.pro();
        info();
    }    
}