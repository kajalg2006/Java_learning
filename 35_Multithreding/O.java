class IThread extends Thread{
    public void run(){
         Thread x = Thread.currentThread();

        for(int i = 0; i < 300; i++) {
            System.out.println(i + " - " + x.getName());
    }
 }
}
class O {
    public static void main(String[] args) throws InterruptedException {
        IThread a = new IThread();
        a.setName("A");
        a.start();
        
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 20) {
                a.join(10);
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}
