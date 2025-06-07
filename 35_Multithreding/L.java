class MyRunnable implements Runnable{
    public void run(){
         Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}
class L {
    
}
