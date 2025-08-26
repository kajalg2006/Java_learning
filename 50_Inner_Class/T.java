class T {
    int x1 = 10;

    class A {
        int x2 = 20;

        class B {
            int x3 = 30;
            class C {
                int x4 = 40;
                class D{
                    int x5 = 50;

                    void info() {
                        System.out.println(x5);
                        System.out.println(x4);
                        System.out.println(x3);
                        System.out.println(x2);
                        System.out.println(x1);
                    }
                }
            }
        }
    } 
    
    public static void main(String[] args) {
        T t = new T();
        A a = t.new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        
        A.B.C.D d = c.new D();

        d.info();
    }
}