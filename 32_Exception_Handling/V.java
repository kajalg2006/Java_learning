class V {
    public static void main(String[] args) {
        System.out.println("A");

        System.out.println(pro());
        
        System.out.println("B");
    }

     static int pro() {
        try {
            System.out.println("X");

            return 44;
        } finally {
            return 99;
        }
    }
}
