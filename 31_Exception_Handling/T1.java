class T1 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("A");

        
        pro();    
        

        System.out.println("Z");
    }    

    static void pro() {
        System.out.println(count++);
        pro();
    }
}