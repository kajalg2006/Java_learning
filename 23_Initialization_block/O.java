public class O {
    void pro() {
        System.out.println(x);
    }   
    
    O() {
        System.out.println(x);
    }
    
    // {
    //     System.out.println(x);
    // }
    
    int x = 99;

    public static void main(String[] args) {
        O a = new O();
        a.pro();
    }
}
