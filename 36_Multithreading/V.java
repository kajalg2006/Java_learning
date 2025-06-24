class EThread extends Thread {
    public void run() {        
        try{ Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }
}

class V {
    public static void main(String[] args) {
        EThread a1 = new EThread();
        a1.setName("Bheem");
        a1.start();
        
        EThread a2 = new EThread();
        a2.setName("Raju");
        a2.start();

        ThreadGroup x = Thread.currentThread().getThreadGroup();
        System.out.println("Main Thread Group's components: ");
        x.list();
    }    
}