class Q {
    public static void main(String[] args) {
        System.out.println("A");
        try{
            System.out.println(args[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            //rethrowing exception
            throw e;
        }
        System.out.println("B");
    }
}
