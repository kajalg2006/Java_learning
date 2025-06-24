class T1 {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();

        ThreadGroup tg = x.getThreadGroup();

        ThreadGroup parentTg = tg.getParent(); 

        ThreadGroup grandpaTg = parentTg.getParent(); 

        System.out.println("Default Thread: " + x.getName());
        System.out.println("Default Thread's Thread Group: " + tg.getName());
        System.out.println("Main Thread Groups's Parent Thread Group: " + parentTg.getName());
        System.out.println("System Thread Groups's Parent Thread Group: " + grandpaTg);
    }    
}