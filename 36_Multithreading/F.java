class CRunnable implements Runnable {
    public void run() {    F.d1.pro();  }}

class C1Runnable implements Runnable {
    public void run() {    F.d2.info(); }}

class F {
    static F d1 = new F();  static F d2 = new F();

    public static void main(String[] args) {
        CRunnable r1 = new CRunnable();
        C1Runnable r2 = new C1Runnable();

        Thread t1 = new Thread(r1, "A");
        Thread t2 = new Thread(r2, "B");
        
        t1.start();
        t2.start();
    }

    void pro() {
        String name = Thread.currentThread().getName();
        synchronized(F.class) {
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }

    void info() {
        String name = Thread.currentThread().getName();
        synchronized(F.class) {
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }
}