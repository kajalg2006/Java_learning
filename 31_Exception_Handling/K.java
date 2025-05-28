// command-line argument:  45 or om or <blank>

class K {
    public static void main(String[] args) {
        System.out.println("start");
        
        try {
            int val = Integer.parseInt(args[0]);
        } catch(Exception e) {  // catch-all
            System.out.println(e);
        }        
        
        System.out.println("end");
    }    
}