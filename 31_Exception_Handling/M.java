// command-line argument:  om or <blank> or 0 or 1 or 2 or 3

class M {
    public static void main(String[] args) {
        System.out.println("A");
        
        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("B");
            
            int[] y = {2, 0, 4};
            System.out.println(y[i]);
            System.out.println("C");
            
            int z = 12 / y[i];
            System.out.println("D");
        } catch(ArrayIndexOutOfBoundsException e) {  
            System.out.println(e);
            System.out.println("AIOBE");
        } catch(NumberFormatException e) {
            System.out.println(e);
            System.out.println("NFE");
        } catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println("AE");
        }      
        
        System.out.println("F");
    }    
}