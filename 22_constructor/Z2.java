class A12{
    A12(int x){
 
    }
 }
 
 
class Z2  extends A12{
    Z2() {
        super(pro());
    }

    static int pro(){
        return 12;
    }

    
    public static void main(String[] args) {
        Z2 a = new Z2();
    }

}
