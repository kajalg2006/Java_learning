class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}

class H {
    public static void main(String[] args) {
        DThread a = new DThread();
        a.setName("ChotaBheem");
        DThread b = new DThread();
        b.setName("Kaliya");
        DThread c = new DThread();
        c.setName("Raju");

        a.start();
        b.start();
        c.start();
    }    
}