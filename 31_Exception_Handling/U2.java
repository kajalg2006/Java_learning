class U2{
     static {
        System.out.println("A");
        try{
        int y = 12 / 0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("B");
    }
    
    public static void main(String[] args) {        
        System.out.println("Hi");
    }    
}