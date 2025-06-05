class AThread extends Thread{
         Thread a = Thread.currentThread();

        public void run(){
            for(int i = 0; i < 30; i++) {
            System.out.println(i + " - run() - " + a.getName());
        
        }
    
}
}

public class E {
    public static void main(String[] args) {
        AThread x =new AThread();
        x.setName("golu");
        x.start();

        Thread a = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - main() - " + a.getName());
        }
    }
    
}
