class F{
    int x =999;

    void pro(){
        System.out.println("H!!!!!");
    }

    void info(){
        System.out.println(x);
        pro();

        A a = new A();
        System.out.println(a);
    }

    public static void main(String[] args) {
        F e = new F();
        e.info();
    }
}