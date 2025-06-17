import java.util.Scanner;

class Circle{
    static Scanner sc = new Scanner(System.in);
    private int radius =0;

    public synchronized void writeRadius(){
        Thread x = Thread.currentThread();
        if(radius ==0){
            System.out.println(x.getName()+ " Set new Radius");
            radius = sc.nextInt();
            System.out.println();
            notify();
        }
        else{
             System.out.println("~~~~~");
             try { wait(); } catch(InterruptedException e) {e.printStackTrace();}
        }
    }

      public synchronized void readRadius() {
        Thread x = Thread.currentThread();

        if(radius != 0) {
            System.out.println(x.getName() + " The radius read: " + radius);
            radius = 0;
            notify();
        } else {
            System.out.println("-----");
            try { wait(); } catch(InterruptedException e) {e.printStackTrace();}
        }
    }
}

class Producer extends Thread {
    public void run() {
        while(true) {
            K.circle.writeRadius();
        }
    }
}

class Consumer extends Thread {
    public void run() {
        while(true) {
            K.circle.readRadius();
        }
    }
}

class K {
    static Circle circle = new Circle();
    public static void main(String[] args) {
        Producer x = new Producer();
        x.setName("Producer");

        Consumer y = new Consumer();
        y.setName("Consumer");

        x.start();
        y.start();
    }    
}