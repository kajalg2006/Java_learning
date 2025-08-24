class D {
    int x = 99;
    
    void pro() {
        System.out.println("Hello...");
    }

    class A {

    }

    public static void main(String[] args) {
        // System.out.println(x);
        // pro();

        //new A();
    }
}


// D.java:16: error: non-static variable this cannot be referenced from a static context
//         new A();
//         ^
// 1 error