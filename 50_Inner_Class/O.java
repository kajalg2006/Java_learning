class O {
    int e = 5;

    void pro() {
        System.out.println("Tokyo");
    }

    class X {
        void info() {
            System.out.println("Japan " + e);
            pro();
        }
    }

    public static void main(String[] args) {
        O t = new O();
        X d = t.new X();
        
        d.info();
      //  d.pro();    // NOT OK
       // System.out.println(d.e);   // NOT OK
    }    
}
// O.java:20: error: cannot find symbol
//         d.pro();    // NOT OK
//          ^
//   symbol:   method pro()
//   location: variable d of type O.X
// O.java:21: error: cannot find symbol
//         System.out.println(d.e);   // NOT OK
//                             ^
//   symbol:   variable e
//   location: variable d of type O.X
// 2 errors