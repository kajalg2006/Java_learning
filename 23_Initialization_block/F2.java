 class F2 {
     {
        System.out.println("XYZ");
     }


     F2(){
        System.out.println("AAA");
        
    }
    F2(int x){
        System.out.println("BBB");
    }
    F2(float x){
        System.out.println("CCC");
    }

    public static void main(String[] args) {
        F2 x =new F2();
        F2 y = new F2(12);
        F2 Z = new F2(3.4f);
    }
}
