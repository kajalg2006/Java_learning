public class O1 {
    public static void main(String[] args) {
        System.out.println("A");

         if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            try{
                
                throw new NoCommandLineArgumentException();
            }catch(NoCommandLineArgumentException e){
                 System.out.println("Problem Solved");
            }
        }  
        System.out.println("B");  
    }
}

class NoCommandLineArgumentException extends RuntimeException {

}

