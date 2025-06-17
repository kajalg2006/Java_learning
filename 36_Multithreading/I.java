class AThread extends Thread{
    public void run(){
        I.i.pro();
    }
}

class BThread extends Thread{
    public void run(){
        I.j.info();
    }
}

class I{
      static X1 i = new X1();
      static X2 j = new X2();

      public static void main(String[] args) {
         AThread a = new AThread();
        a.setName("A");
        BThread b = new BThread();
        b.setName("B");

        a.start();
        b.start();
      }
}

class X1{
    synchronized void pro(){
        String name =  Thread.currentThread().getName();
        for(int i=0; i<15;i++){
            try{ Thread.sleep(200);} catch(InterruptedException e){ e.printStackTrace(); }
            if(i == 12) {
                I.j.info();
            }
            System.out.println(i + " - " + name);   
        }
    }
}


class X2 {
    synchronized void info() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<40;i++) {     
            try { Thread.sleep(200); } catch(InterruptedException e) { e.printStackTrace(); }
            if(i == 10) {
                I.i.pro();
            }
            System.out.println(i + " - " + name);            
        }        
    }    
}