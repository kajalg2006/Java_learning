class GThread extends Thread{
    public void run(){
        Thread x =Thread.currentThread();
        for(int i =0; i<20;i++){
            System.out.println(i+ " -run "+x.getName());
        }
    }
}

class K {
    public static void main(String[] args) throws InterruptedException {
        GThread a= new GThread();
        a.setName("kaju");

        GThread b= new GThread();
        b.setName("badam");

        a.start();
        b.start();

        Thread x= Thread.currentThread();
          a.sleep(5000);
        for(int i = 0; i < 30; i++) {            
            System.out.println(i + " - main() - " + x.getName());
        }
    }
}
