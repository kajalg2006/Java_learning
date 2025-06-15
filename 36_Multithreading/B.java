class B1Runnable implements Runnable {
    public void run() {        
        B.pro();
    }
}

class B2Runnable implements Runnable {
    public void run() {
        B.m.info();
    }
}

class B {
     static B m = new B();
    public static void main(String[] args) {
        Thread t1 = new Thread(new B1Runnable(), "A");    
        Thread t2 = new Thread(new B2Runnable(), "B");       
        t1.start();
        t2.start();
    }       

    synchronized static void pro() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(30);} catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " - " + x.getName());
        }
    }

    synchronized  void info() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(30);} catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " - " + x.getName());
        }
    }
}