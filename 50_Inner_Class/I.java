class I {
    class A {
        int w = 78;

        void pro() {
            System.out.println("jai ho");
        }
    }

    public static void main(String[] args) {
        I i = new I();
        
        A a = i.new A();

        System.out.println(a.w);
        a.pro();
    }    
}