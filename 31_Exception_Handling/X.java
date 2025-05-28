class X {
    public static void main(String[] args) {
        System.out.println("main start");
        
        try {
            System.out.println("A");
        } finally {
            System.out.println("X");
        }

        System.out.println("main end");
    }
}