class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(x.getName() + " - " + i);
        }

        System.out.println(N.a.isAlive());
    }
}

class N {
    static Thread a;
    public static void main(String[] args) {
        a = Thread.currentThread();

        DThread y = new DThread();
        y.setName("A");
        y.start();

        try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
        
    }    
}