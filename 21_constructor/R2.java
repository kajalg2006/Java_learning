class R2{
    static int count  = 0;
     R2(){
        count++;
     }
    public static void main(String[] args) {
        
        R2 a = new R2();    
        System.out.println(a.count);
        R2 b = new R2();    
        System.out.println(b.count);
        R2 c = new R2();    
        System.out.println(c.count);
        R2 d = new R2();         
        System.out.println(d.count);
    }
}
