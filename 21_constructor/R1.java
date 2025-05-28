class R1 {
    static int count = 0;

    R1() {
        count++;
    }

    public static void main(String[] args) {
        R1 a = new R1();    
        R1 b = new R1();    
        R1 c = new R1();    
        R1 d = new R1(); 
        
        System.out.println(a.count);
        System.out.println(b.count);
        System.out.println(c.count);
        System.out.println(d.count);
    }    
}
