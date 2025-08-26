class AB {
    class X {
        void pro() {
            System.out.println("Hello");
        }
    }
}

class W extends AB {
    public static void main(String[] args) {
        W w = new W();

        AB.X x1 = w.new X();
        W.X x2 = w.new X();
        X x3 = w.new X();

        x1.pro();
        x2.pro();
        x3.pro();
    }    
}