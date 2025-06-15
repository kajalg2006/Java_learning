class ARunnable implements Runnable{
    public void run(){
        Thread x  = Thread.currentThread();

         for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw Rs 10. Current Balance is: " + C.ac.getBalance());
            C.ac.withdraw(10);
            System.out.println(x.getName() + " After. Current Balance is: " + C.ac.getBalance());
        }
    }
}

class C{
    static Account ac =new Account(50,"2746", "Sv");
    public static void main(String[] args) {
          ARunnable r = new ARunnable();

        Thread t1 = new Thread(r, "mohan");    
        Thread t2 = new Thread(r, "sohan"); 
        
        t1.start();
        t2.start();
    }
}