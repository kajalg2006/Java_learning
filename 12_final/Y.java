public final class Y {
    static int w = 21;
}

class R {

    public static void main(String[] args) {
        System.out.println(Y.w);
        
        Y.w = 23;

        System.out.println(Y.w);
    }    
} 
