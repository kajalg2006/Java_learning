class R {
    int k = 333;

    class Y extends A2 {
        int k = 33;

        void info() {
            int k = 3;
            System.out.println(k);
            System.out.println(this.k);
            System.out.println(super.k);
            System.out.println(R.this.k);
        }
    }   
    
    public static void main(String[] args) {
        R q = new R();
        Y y = q.new Y();

        y.info();
    }
}

class A2 {
    int k = 3333;
}