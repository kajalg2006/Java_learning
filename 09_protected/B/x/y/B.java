package x.y;
import a.b.c.A;
 class B extends A {
    public static void main(String[] args) {
       // A a = new A();- not ok 
       B b = new B();
       System.out.println(b.y);    //-ok
    }
}
