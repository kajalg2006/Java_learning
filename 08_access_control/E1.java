class A{
     private int  y = 78 ; 
     void pro(){
        System.out.println("hello hi...");
     }
}

class E1{
    public static void main(String[] args) {
        A x = new A();
        //System.out.println(x.y);
        x.pro();
    }
}
