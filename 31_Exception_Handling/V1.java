 class V1 {
    {
        System.out.println("A");
        try {
            int y = 12 / 0; 
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("B");
    }
    
    public static void main(String[] args) {        
        System.out.println("main start");

        V1 v = new V1();

        System.out.println("main end");
    }    
}