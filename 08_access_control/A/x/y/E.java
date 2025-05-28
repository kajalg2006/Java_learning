package x.y;
import a.b.c.A;
class E extends A {
    public static void main(String[] args) {
        E a = new E();
        //a.pro();
    }
}
// x\y\E.java:9: error: cannot find symbol
//         a.pro();
//          ^
//   symbol:   method pro()
//   location: variable a of type E
// 1 error