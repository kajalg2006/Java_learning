import java.util.ArrayList;

class H {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("prayag");
        
        System.out.println(x);

        String y= new String("vidit");

        x.remove(y);
        System.out.println(x);
    }
}