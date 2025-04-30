class E extends X1 {
   {
     System.out.println("K");

   }

E(){
    System.out.println("M");
}

public static void main(String[] args) {
    System.out.println("main-start");
    E x = new E();
    System.out.println("main-end");        
}

}

class X1{
    {
        System.out.println("H");
    }

    X1(){
        System.out.println("A");
    }

}
