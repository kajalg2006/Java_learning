class Y1Runnable implements Runnable {
    public void run() {
        for(int i=0;i<30;i++) {
            try { Thread.sleep(300);} catch(InterruptedException e) { e.printStackTrace();}
            W.aa.pro(i);
        }
    }
}

class Y2Runnable implements Runnable {
    public void run() {
        for(int i=0;i<30;i++) {
            try { Thread.sleep(300);} catch(InterruptedException e) { e.printStackTrace();}
            W.aa.info(i);
        }
    }
}

class W {
    static W aa = new W();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Y1Runnable(), "A");    
        Thread t2 = new Thread(new Y2Runnable(), "B");    
    
        t1.start();
        t2.start();
    }   
    
    synchronized void pro(int i) {
        Thread x = Thread.currentThread();
            System.out.println(i + " - " + x.getName());
    }

    synchronized void info(int i) {
        Thread x = Thread.currentThread();
            System.out.println(i + " - " + x.getName());
    }
}