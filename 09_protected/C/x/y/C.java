package x.y;
import a.b.c.A;
 class C {
  public static void main(String[] args) {
    A a = new A();
    //System.out.println(a.y);
  }    
}
// x\y\C.java:6: error: y has protected access in A
//     System.out.println(a.y);
//                         ^
// 1 error