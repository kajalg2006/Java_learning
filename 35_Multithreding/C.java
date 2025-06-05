class C {
    public static void main(String[] args) {
        Thread a= Thread.currentThread();
        System.out.println(a+"-"+a.getId());
        aaa();
    }

     
    static void aaa() {
        Thread a = Thread.currentThread();

        System.out.println(a + " - " + a.getId());
        
        bbb();
    }
    static void bbb() {
        Thread a = Thread.currentThread();

        System.out.println(a + " - " + a.getId());
        
        ccc();
    }

     static void ccc() {
        Thread a = Thread.currentThread();

        System.out.println(a + " - " + a.getId());
    }
}
