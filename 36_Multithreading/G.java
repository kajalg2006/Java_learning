class CRunnable implements Runnable {
    public void run() {    G.d1.pro();  }}

class C1Runnable implements Runnable {
    public void run() {    G.d2.info(); }}

class G{
    static G d1 = new G();  static G d2 = new G();

    public static void main(String[] args) {
        new Thread(new CRunnable(), "A").start();
        new Thread(new C1Runnable(), "B").start();       
    }  

    void pro() {
        String name = Thread.currentThread().getName();
        synchronized(G.class) {
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        }
    }

  static  void info() {
        String name = Thread.currentThread().getName();
       
            for(int i=0; i < 30; i++) {
                try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
                System.out.println(i + " - " + name);
            }
        
    }
}