class S {
 public static void main(String[] args) {
    System.out.println("A");
    aaa();
    System.out.println("E");
 }    
  static void aaa() {
        System.out.println("Q");
        bbb();
        System.out.println("K");
    }

    static void bbb() {
        System.out.println("J");
        ccc();
        System.out.println("D");
    }


    
    static void ccc()  {
        System.out.println("Y");

        try {
            int y = 12 / 0;
        } catch(ArithmeticException e) {
            // System.out.println(e);
             System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("B");
    }
}
