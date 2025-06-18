class L {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        boolean flag = x.isAlive();

        System.out.println(flag);
    }    
}