class CThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        for (int i = 0; i < 30; i++) {
            System.out.println(x.getName() + " -" + i);
        }
        System.out.println(M.a.isAlive());
    }
}

class M {
    static Thread a;

    public static void main(String[] args) {
        a = Thread.currentThread();
        CThread y = new CThread();
        y.setName("A");
        y.start();
    }
}
