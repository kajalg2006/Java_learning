class P {
    class X {
        int r = 3;

        void pro() {
            System.out.println("Paris");
        }
    }

    public static void main(String[] args) {
        P u = new P();
        X w = u.new X();

        System.out.println(w.r);
        w.pro();

       // System.out.println(u.r);  // NOT OK
       // u.pro();  // NOT OK
    }    
}
// P.java:17: error: cannot find symbol
//         System.out.println(u.r);  // NOT OK
//                             ^
//   symbol:   variable r
//   location: variable u of type P
// P.java:18: error: cannot find symbol
//         u.pro();  // NOT OK
//          ^
//   symbol:   method pro()
//   location: variable u of type P
// 2 errors