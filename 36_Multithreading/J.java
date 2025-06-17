class C1Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        synchronized(B1.class) {
            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace();}
            synchronized(B2.class) {
                System.out.println("How are you!!!!");
            }
        }
    }
}

class C2Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        synchronized(B2.class) {
            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace();}
            synchronized(B1.class) {
                System.out.println("I am good!!!!");
            }
        }
    }
}

class J {
    public static void main(String[] args) {
        Thread t1 = new Thread(new C1Runnable(), "A");
        Thread t2 = new Thread(new C2Runnable(), "B");

        t1.start();
        t2.start();
    }
}

class B1 { }
class B2 { }