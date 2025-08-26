class L{
    private float h = 89.967f;

    private void info() {
        System.out.println("I am danger method");
    }

    class A {
        private void pro() {
            System.out.println(h);
            
            info();
        }
    }

    public static void main(String[] args) {
        L k = new L();
        
        A a = k.new A();

        a.pro();
    }   
}