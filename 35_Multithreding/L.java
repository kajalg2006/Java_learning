class MyRunnable implements Runnable{
    public void run(){
         Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}
class L {
    public static void main(String[] args) {
        
        MyRunnable r = new MyRunnable();
        
        Thread t = new Thread(r);
        
        t.setName("Raju");
        
        t.start();
          Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            System.out.println(i + " - main() - " + x.getName());
        }
    }


}
