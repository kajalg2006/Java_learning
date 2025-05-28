package a.b.c;

import x.y.B;

class A {
    public static void main(String[] args) {
        B a = new B();

        //System.out.println(a.y);
    }
}

// a\b\c\A.java:9: error: y is not public in B; cannot be accessed from outside package
//         System.out.println(a.y);
//                             ^
// 1 error



// CMD
// --------/F>javac a/b/c/A.java
// --------/F>java a/b/c/A