class HThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        try{ Thread.sleep(100); } catch(InterruptedException e) { e.printStackTrace(); }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("A Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());
    }
}

class Y2 {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        x.setPriority(2);

        HThread a = new HThread();
        a.setName("A");
        a.start();
        

        System.out.println("Default Thread's Info: ");
        System.out.println("Name: " + x.getName());
        System.out.println("ID: " + x.getId());
        System.out.println("Priority: " + x.getPriority());

        // x.setPriority(8);
    }    
}