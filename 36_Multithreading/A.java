class A1Runnable implements Runnable {
    public void run() {        
        A.pro();
    }
}

class A2Runnable implements Runnable {
    public void run() {
        A.info();
    }
}

class A {
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new A1Runnable(), "A");    
        Thread t2 = new Thread(new A2Runnable(), "B");       
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

    synchronized static void info() {
        Thread x = Thread.currentThread();
        for(int i=0;i<30;i++) {
            try { Thread.sleep(30);} catch(InterruptedException e) { e.printStackTrace();}
            System.out.println(i + " - " + x.getName());
        }
    }
}