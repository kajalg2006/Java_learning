public class D {
    public static void main(String[] args) {
        aaa();
        Thread a= Thread.currentThread();
        for(int  i = 0; i<10;i++){
            System.out.println(i + " - main() - " + a.getName());
        }
        
    }

    static void aaa(){
        Thread a = Thread.currentThread();

        for(int i = 0; i < 30; i++) {
            System.out.println(i + " - aaa() - " + a.getName());
        }
    }
}
