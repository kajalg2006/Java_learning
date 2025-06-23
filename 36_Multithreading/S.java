class S {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();

        System.out.println(x);
        System.out.println(tg);
    }
}
