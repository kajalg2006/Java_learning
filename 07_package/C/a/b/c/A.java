package a.b.c;

//import x.y.B;
class A {
    public static void main(String[] args){
       // B x;
    }
}



// a\b\c\A.java:3: error: B is not public in x.y; cannot be accessed from outside package
// import x.y.B;
//           ^
// a\b\c\A.java:7: error: B is not public in x.y; cannot be accessed from outside package
//         B x;
//         ^
// 2 errors



// CMD
// --------/C>javac a/b/c/A.java