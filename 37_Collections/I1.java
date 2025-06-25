import java.util.ArrayList;

class I1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("vidit");
        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("prayag");
        x.add("vidit");
        
        System.out.println(x);
        
        String y = new String("vidit");
        x.remove(y);
        System.out.println(x);
        x.remove(y);
        System.out.println(x);
        x.remove(y);        
        System.out.println(x);
    }
}