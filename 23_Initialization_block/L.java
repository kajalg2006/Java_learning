class Y3 {
    {    System.out.println("A");  }

    static {   System.out.println("B");  }    

    {    System.out.println("D"); }

    static {    System.out.println("E");
        int y = 12/0;
    }
}

class L extends Y3 {
    {    System.out.println("C");  }

    static {     System.out.println("Y");    }    

    {    System.out.println("M");    }

    static {    System.out.println("H");    }    

    public static void main(String[] args) {
        System.out.println("main start");
        L x = new L();
        // Y3 x = new Y3();
        System.out.println("main end");
    }
}
