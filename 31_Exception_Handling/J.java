// command-line argument:  45 or om or <blank>

class J {
    public static void main(String[] args) {
        System.out.println("start");
        
        try {
            int val = Integer.parseInt(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
        System.out.println("end");
    }    
}