class D1Thread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + x.getName() + " - " + x.getId());
        }
    }
}

class H1 {
    public static void main(String[] args) {
        D1Thread a = new D1Thread();
        // a.setName("ChotaBheem");
        D1Thread b = new D1Thread();
        // b.setName("Kaliya");
        D1Thread c = new D1Thread();
        // c.setName("Raju");

        a.start();
        b.start();
        c.start();
    }    
}