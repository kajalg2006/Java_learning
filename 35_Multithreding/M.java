class YourRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        for (int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}

class M {
    public static void main(String[] args) {

        YourRunnable r = new YourRunnable();

        Thread t = new Thread(r);

        t.setName("Raju");

        t.start();

        Thread x = Thread.currentThread();

        for (int i = 0; i < 100; i++) {
                        System.out.println(i + " - main() - " + x.getName());
        
        }
    }
}
