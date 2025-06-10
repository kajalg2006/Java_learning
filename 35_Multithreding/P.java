public class P {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread x = Thread.currentThread();

        x.join();

        System.out.println("B");
    }    
}
