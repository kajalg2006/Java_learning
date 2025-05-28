package a.b.c;
class C extends A{

    public static void main(String[] args) {
        
        C c = new C();   //ok
        A a = new A();   //ok
        System.out.println(a.y);
        System.out.println(c.y); 
    }
}
