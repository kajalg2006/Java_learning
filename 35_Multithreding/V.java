class Y1Runnable implements Runnable {
    public void run() {
       for(int i=0;i<30;i++) {
            V.aa.pro(i);
        }
    }
}

class Y2Runnable implements Runnable {
    public void run() {
       for(int i=0;i<30;i++) {
            V.bb.info(i);
        }
    }
}

class V {
    static V aa = new V();
    static V bb = new V();

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