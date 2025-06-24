class FRunnable implements Runnable {
    public void run() {        
        try{ Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

class X {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Dholakpur");

        FRunnable r = new FRunnable();

        Thread a1 = new Thread(tg, r);
        a1.setName("Bheem");
        a1.start();
        
        Thread a2 = new Thread(tg, r);
        a2.setName("Raju");
        a2.start();

        Thread a3 = new Thread(tg, r);
        a3.setName("Klaiya");
        a3.start();

        Thread a4 = new Thread(tg, r);
        a4.setName("Jaggu");
        a4.start();

        ThreadGroup x = Thread.currentThread().getThreadGroup();
        System.out.println("Main Thread Group's components: ");
        x.list();
    }    
}