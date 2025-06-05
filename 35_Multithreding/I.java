class EThread extends Thread{
     public void run() {
        Thread x = Thread.currentThread();

        for(int i = 0; i < 100; i++) {
            System.out.println(i + " - run() - " + x.getName());
        }
    }
}
class I {
    public static void main(String[] args) {
        EThread a= new EThread();
        a.setName("raju");
        a.start();
        Thread x = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            if(i == 15) {
                try {
                    Thread.sleep(5000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i + " - main() - " + x.getName());
        }

    }
}
