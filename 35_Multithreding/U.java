class X4Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw Rs 10. Current Balance is: " + U.ac.getBalance());
            if(U.ac.getBalance() >= 10) {
                try{ Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
                U.ac.withdraw(10);
            }
            System.out.println(x.getName() + " After. Current Balance is: " + U.ac.getBalance());
        }
    }
}

class U {
    static Account4 ac = new Account4(50, "5678", "Sv");

    public static void main(String[] args) {
        X4Runnable r = new X4Runnable();

        Thread t1 = new Thread(r, "mohan");    
        Thread t2 = new Thread(r, "sohan"); 
        
        t1.start();
        t2.start();
    }    
}