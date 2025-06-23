class DThread extends Thread {
    public void run() {
        EThread a = new EThread();
        a.setName("chitragupt");
        a.setDaemon(false);
        a.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}

class EThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<10;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}

class R1 {
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Yamraj");
        x.setDaemon(true);
        x.start();

        try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }    
}