 // input: <blank> or om or 0 or 1 or 2 or 3 

class W {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            
            int[] y = {12, 45, 67};
            System.out.println(y[i]);

            String x = "om";
            System.out.println(x.charAt(i));

        } catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("SIOBE");
        } catch(NumberFormatException e) {
            System.out.println(e);        
            System.out.println("NFE");
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("IOBE");
        } 
    }    
} 
