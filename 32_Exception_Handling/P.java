class P {
    public static void main(String[] args) {
       System.out.println("A");
       try{
           System.out.println(args[0]);
       }catch(ArrayIndexOutOfBoundsException e){
           //conversion of exception
           throw new NoCommandLineArgumentException();
       }
       System.out.println("B");
    }
}
class NoCommandLineArgumentException extends RuntimeException {

}
