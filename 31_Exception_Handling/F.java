class F{
    public static void main(String[] args) {
        System.out.println("start");

        String x =null;
        
        try{
           System.out.println(x.length());

        }catch(NullPointerException e){
       System.out.println("some problem");
        }
        System.out.println("end");
    }
}
