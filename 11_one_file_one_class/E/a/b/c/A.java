package a.b.c;
// import x.y.B;
public class A {
    public static void main(String[] args) {
       // B a;
    }
}
// a\b\c\A.java:2: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:5: error: B is not public in x.y; cannot be accessed from outside package
//         B a;
//         ^
// 2 errors
