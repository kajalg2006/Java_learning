class GThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        System.out.println("A Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());
    }
}

class Y1 {
    public static void main(String[] args) {
        GThread a = new GThread();
        a.setName("A");
        a.start();
        
        try{ Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        Thread x = Thread.currentThread();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Default Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());
    }    
}