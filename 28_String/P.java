    
    
class P {
    public static void main(String[] args) {
        String x = new String("mohan");
        String y = new String("mohan");
        String z = new String("MoHaN");


        System.out.println(x.equals(y));
        
        System.out.println(x.equals(z));
         System.out.println(x.equalsIgnoreCase(z));
    }    
}