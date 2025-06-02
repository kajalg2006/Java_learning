class O {
    public static void main(String[] args) {
        System.out.println("A");
        
        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            throw new NoCommandLineArgumentException();
        }     

        System.out.println("B");
    }   
}


class NoCommandLineArgumentException extends RuntimeException {

}