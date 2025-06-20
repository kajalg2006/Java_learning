class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}

class P {
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Yam");
        x.start();
    }    
}