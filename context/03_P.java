 class P {
    static int s = 89;
 
    public static void main(String[] args) {
        P a = new P();
        //a.s= 99;// => compiler understand's it P.s
        
        P b = new P();
        //b.s= 999;
        
        P c = new P();
       // b.s= 9999;
          

        a.pro();
        b.pro();
        c.pro();

        
    }
    void pro(){
        System.out.println(s);
    }
    
}
