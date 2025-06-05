class FThread extends Thread {
    public void run()/* throws InterruptedException*/  {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            if(i == 15) {
               // Thread.sleep(1000);
            }
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}

class J {
    public static void main(String[] args) {
        FThread a = new FThread();
        a.setName("Ketu");
        a.start();

        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {            
            System.out.println(i + " - main() - " + x.getName());
        }
    }    
}
// J.java:2: error: run() in FThread cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error