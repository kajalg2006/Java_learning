class BRunnable implements Runnable {
    public void run() {    D.d1.pro();  }}

class B1Runnable implements Runnable {
    public void run() {    D.d1.info(); }}

class D {
    static D d1 = new D();  static D d2 = new D();

    public static void main(String[] args) {
        BRunnable r1 = new BRunnable();
        B1Runnable r2 = new B1Runnable();

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");
        
        t1.start();
        t2.start();
    }

    void pro() {
        String name = Thread.currentThread().getName();
        synchronized(this) {
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }

    void info() {
        String name = Thread.currentThread().getName();
        synchronized(this) {
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }
}