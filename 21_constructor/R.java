 class R {
     int  count =0;
    R(){
        count++;
    }
    public static void main(String[] args) {
        R a = new R();    
        R b = new R();    
        R c = new R();    
        R d = new R(); 
        
        System.out.println(a.count);
        System.out.println(b.count);
        System.out.println(c.count);
        System.out.println(d.count);
    }
}
