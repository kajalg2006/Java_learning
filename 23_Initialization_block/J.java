public class J {
    {
        System.out.println("C");
    }

    static{
        System.out.println("Y");
    }
    
    {
        System.out.println("M");
    }
    static {
        System.out.println("H");
    }    

    public static void main(String[] args) {
        System.out.println("main start");
        J x = new J();
        System.out.println("main end");
}
}
