package x.y;
import a.b.c.A;
 class B  extends A  {
    public static void main(String[] args) {
        // A a = new A();  //not ok
        B a = new B();     //ok
        System.out.println(a.y);
    }
}
