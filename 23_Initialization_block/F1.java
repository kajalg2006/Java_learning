class F1 {
    F1(){
        System.out.println("AAA");
        System.out.println("ABC");
    }
    F1(int x){
        System.out.println("AAA");
        System.out.println("CAB");
    }
    F1(float x){
        System.out.println("AAA");
        System.out.println("CBA");
    }
    public static void main(String[] args) {
        F1 a = new F1();
        F1 b = new F1(12);
        F1 c = new F1(123.4f);
    }
}
