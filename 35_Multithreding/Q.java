class JThread extends Thread{
     public void run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            if(i == 15) {
                try { Q.x.join(); } catch(InterruptedException e) { e.printStackTrace();}
            }
            System.out.println(i + " - " + t.getName());
        }
    }   
}
class Q {
    static Thread x= Thread.currentThread();
    public static void main(String[] args) {
        JThread a= new JThread();
        a.setName("A");
        a.start();
         for(int i=0;i<30;i++) {
            if(i == 15) {
                try { a.join(); } catch(InterruptedException e) { e.printStackTrace();}
            }
            System.out.println(i + " - " + x.getName());
        }
    }
}
