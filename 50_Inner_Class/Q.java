class Q {
    int k = 333;

    class Y extends A1 {
        // int k = 33;

        void info() {
            // int k = 3;
            System.out.println(k);
        }
    }   
    
    public static void main(String[] args) {
        Q q = new Q();
        Y y = q.new Y();

        y.info();
    }
}

class A1 {
    int k = 3333;
}