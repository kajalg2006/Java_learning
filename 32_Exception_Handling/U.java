class U {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            System.out.println("X");
            int y = 12/0;
            System.out.println("Y");
        }catch(ArithmeticException e){
            // e.printStackTrace();
            throw new NullPointerException();
        }finally{
            System.out.println("Z");
             if(12 < 13)
                throw new ClassCastException();
        }
        
        System.out.println("B");
    }
}
