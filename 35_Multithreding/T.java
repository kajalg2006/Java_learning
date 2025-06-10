class X3Runnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();
        
        for(int i=0;i<5;i++) {
            System.out.println(x.getName() + " going to withdraw Rs 10. Current Balance is: " + T.ac.getBalance());
            T.ac.withdraw(10);
            System.out.println(x.getName() + " After. Current Balance is: " + T.ac.getBalance());
        }
    }
}

class T {
    static Account3 ac = new Account3(50, "5678", "Sv");

    public static void main(String[] args) {
        X3Runnable r = new X3Runnable();

        Thread t1 = new Thread(r, "mohan");    
        Thread t2 = new Thread(r, "sohan"); 
        
        t1.start();
        t2.start();
    }    
}
