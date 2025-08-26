class J{
    int t = 567;

    void info() {
        System.out.println("Some Info");
    }

    class A {
        void pro() {
            System.out.println(t);
            info();
        }
    }
    public static void main(String[] args) {
        J i = new J();
        A a = i.new A();
        a.pro();
    }
}