import java.util.ArrayList;

class J {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add("vidit");
        x.add("mohan");
        x.add("vidit");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("vidit");
        x.add("prayag");
        x.add("vidit");
        
        System.out.println(x);
        
        String y = new String("vidit");
        
        while(x.remove(y));
        
        System.out.println(x);                
    }
}