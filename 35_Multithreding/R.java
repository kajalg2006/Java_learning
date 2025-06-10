class X1Runnable implements Runnable{
    public void run(){
        Thread x = Thread.currentThread();
        
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw Rs 10. Current Balance is: " + R.ac.getBalance());
            try{ Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace(); }
            R.ac.withdraw(10);
            System.out.println(x.getName() + " After. Current Balance is: " + R.ac.getBalance());
        }
    }
}
class R {
    static Account1 ac = new Account1(50, "5678", "Sv");

    public static void main(String[] args) {
        X1Runnable r =new X1Runnable();
        Thread t1= new Thread(r,"A");
        Thread t2= new Thread(r,"B");

        t1.start();
        t2.start();
    }
    
}
