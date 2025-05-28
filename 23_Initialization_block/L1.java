class Y3{
    static {
        System.out.println("H");
    }


    {
        System.out.println("I");
    }
    static{
        System.out.println("J");

    }
    {
        System.out.println("L");
    }
}
 class L1 /*extends Y3 */{
    static{
        System.out.println("A");
    }

    {
        System.out.println("B");
    }
    static{
        System.out.println("C");
    }

    {
        System.out.println("D");
    }

    public static void main(String[] args) {
        System.out.println("main-start");
        K x= new K();
        System.out.println("main-end");
    }
}
