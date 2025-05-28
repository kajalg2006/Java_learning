 class D {
    {
        System.out.println("Namaste");
    }   

    D() {
        //super();
        //instance level variables(memory allocation), methods(register) and initialization-blocks(execute)
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        System.out.println("start -main");

        D x = new D();

        System.out.println("end -main");
    }
}
