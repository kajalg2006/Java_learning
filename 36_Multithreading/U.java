class U{
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();
        ThreadGroup parentTg = tg.getParent();
        ThreadGroup grandpaTg = parentTg.getParent(); 
        
        System.out.println("System Thread Groups's components: ");
        parentTg.list();
    }
}