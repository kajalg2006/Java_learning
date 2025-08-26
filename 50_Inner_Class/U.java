class U {
    int x = 10;

    class A {
        int x = 20;

        class B {
            int x = 30;
            
            class C {
                int x = 40;
                
                class D {
                    int x = 50;

                    void info() {
                        int x = 60;
                        System.out.println(x);
                        System.out.println(this.x);
                        System.out.println(C.this.x);
                        System.out.println(B.this.x);
                        System.out.println(A.this.x);
                        System.out.println(U.this.x);
                    }
                }
            }
        }
    }    

    public static void main(String[] args) {
        U s = new U();

        A a = s.new A();

        A.B b = a.new B();
        
        A.B.C c = b.new C(); 

        A.B.C.D d = c.new D();

        d.info();
    }
}