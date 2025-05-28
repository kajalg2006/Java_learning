class AAA {
     AAA() {
          // Compiler provided super no argument call...
          // super();
          System.out.println("Namsete");
     }
}

class K extends AAA {
     // compiler supplied constructor (default consturctor)
     // K(){

     // }
     public static void main(String[] args) {
          System.out.println("---- main start");
          K t = new K();
          System.out.println("---- main end");
     }
}
