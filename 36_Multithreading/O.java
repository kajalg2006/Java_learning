class O {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isDaemon();

        System.out.println(flag);
    }    
}