class DThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(i + " - " + x.getName());
        }

        System.out.println(x.getName() + " is a Daemon Thread: " + x.isDaemon());
    }
}

class P1 {
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Yam");
        x.setDaemon(true);
        x.start();
    //    Thread y = Thread.currentThread();
        try{
            Thread.sleep(35);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }    
}