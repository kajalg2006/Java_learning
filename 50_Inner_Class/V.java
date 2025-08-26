class V extends A4 {
    void aaa() {
        System.out.println("R class ka aaa()");
    }

    class Y extends A3 {
        void aaa() {
            System.out.println("Y class ka aaa()");
        }

        void info() {
            aaa();
            super.aaa();
            V.this.aaa();
            V.super.aaa();
        }
    }   
    
    public static void main(String[] args) {
        V q = new V();
        Y y = q.new Y();

        y.info();
    }
}

class A3 {
    void aaa() {
        System.out.println("A3 class ka aaa()");
    }
}

class A4 {
    void aaa() {
        System.out.println("A4 class ka aaa()");
    }
}
