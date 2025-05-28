public class E {
    E(){
     System.out.println("HI");
    }

    E(int  y ){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        E a =new E();
        E b = new E();

        System.out.println(a);
        System.out.println(b);
    }
}
