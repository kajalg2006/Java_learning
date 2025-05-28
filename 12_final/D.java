 class X4{
    final void pro(){
        System.out.println("hi.........");
    }
 }
 
 class D extends X4 {
    public static void main(String[] args) {
        D x = new D();

        x.pro();   //access through inheritance
    }
}
