class HThread extends Thread {
    public void run() {
        H1Thread a = new H1Thread();
        a.setName("B");
        a.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i==20) {
                try { a.join(); } catch(InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}

class H1Thread extends Thread {
    public void run() {
        H2Thread a = new H2Thread();
        a.setName("C");
        a.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 20) {
                try { a.join(); } catch(InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}

class H2Thread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName());
        }
    }
}

class N {
    public static void main(String[] args) throws InterruptedException {
        HThread a = new HThread();
        a.setName("A");
        a.start();
        
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 20) {
                a.join();
            }
            System.out.println(i + " - " + x.getName());
        }
    }    
}