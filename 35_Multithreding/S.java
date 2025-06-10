class X2Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw Rs 10. Current Balance is: " + S.ac.getBalance());
            S.ac.withdraw(10);
            System.out.println(x.getName() + " After. Current Balance is: " + S.ac.getBalance());
        }
    }
}

class S {
    static Account2 ac = new Account2(50, "5678", "Sv");

    public static void main(String[] args) {
        X2Runnable r = new X2Runnable();

        Thread t1 = new Thread(r, "mohan");    
        Thread t2 = new Thread(r, "sohan"); 
        
        t1.start();
        t2.start();
    }    
}

