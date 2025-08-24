class H{
    class A{

    }

    public static void main(String[] args) {
        A x = new H().new A();

        //          or
        H h = new H();
        A a = h.new A();
    }
}

