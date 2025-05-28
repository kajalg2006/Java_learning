class A2 {
    private int y = 45;

    int pro() {
        System.out.println(y);

        return y;
    }
}

class E3 {
    public static void main(String[] args) {
        A2 a = new A2();

        int w = a.pro();
        System.out.println(w);
    }
}
