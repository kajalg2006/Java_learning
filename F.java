public class F extends X2 {
    // {
    //     System.out.println("K");
    // }
    
    F() {
        System.out.println("K");
        System.out.println("M");
    }

    public static void main(String[] args) {
        System.out.println("main-start");
        F x = new F();
        System.out.println("main-end");
    }
}

class X2 {
    // {
    // System.out.println("H");
    // }

    X2() {
        System.out.println("H");
        System.out.println("A");
    }
}
