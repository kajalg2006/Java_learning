class HThread extends Thread{
   public void run(){
    Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - " + x.getName());
        }
   }
}
class M{
 public static void main(String[] args) throws InterruptedException {
  HThread a = new HThread();
        a.setName("A");
        a.start();
        Thread x= Thread.currentThread();
        for(int i =0; i<20;i++){
            if(i==15){

                a.join();
            }
            System.out.println(i + " - " + x.getName());
        }
        
    }
}