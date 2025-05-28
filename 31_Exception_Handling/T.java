class T {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("A");

        try {
            pro();    
        } catch(Throwable e) {
            System.out.println(e);
        } finally {
            System.out.println("Essential Code");
        }

        System.out.println("Z");
    }    

    static void pro() {
        System.out.println(count++);
        pro();
    }
}