class student{
 public static void main(String[] args) {
    Pen x = new Pen();
    x.write();
 }
}

class Pen{
   void write(){
    System.out.println("write()");
   }
}

// Student ----> HAS-A ----> Pen