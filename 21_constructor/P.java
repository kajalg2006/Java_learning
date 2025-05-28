class B1 {
    int a = 23;
    static boolean q;

    void aaa() {
        System.out.println("B1 aaa()");
    }

    static void mno() {
        System.out.println("B1 mno()");
    }
}

class B2 extends B1{
    float b = 4.3f;
    static  double c= 90.0;
    void bbb(){
        System.out.println("B2 bbb()");
    }
    static void pqr(){
        System.out.println("B2 pqr()");
    }
}
class B3 extends B2 {
    char t = 'W';
    static double e = 3.4;

    void ccc() {
        System.out.println("B3-ccc()");
    }

    static void abc() {
        System.out.println("B3-static-abc()");
    }
}
class P {
   static public  void main(String[] args){
    B3 x = new B3();

    System.out.println(x.q);
    x.mno();
    
    System.out.println(x.b);
    x.pqr();

    System.out.println(x.e);
    x.abc();
  }
}
