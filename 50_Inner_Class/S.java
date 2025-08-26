class S {
    class A {
        class B {
            class C {
                class D{

                }
            }
        }
    }    

    public static void main(String[] args) {
        S s = new S();

        A a = s.new A();

        A.B b = a.new B();
        
        A.B.C c = b.new C(); 

        A.B.C.D d = c.new D();

        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}