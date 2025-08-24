class AA {
    int x = 55;

    void pro() {
        System.out.println("Namaskar...");
    }

    class A {

    }   
}

class G {
    public static void main(String[] args) {
        AA y = new AA();

        System.out.println(y.x);
        y.pro();
        // A a = y.new A();
        AA.A a = y.new A();
        System.out.println(a);
    }

}
