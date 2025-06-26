import java.util.ArrayList;
import java.util.Iterator;

class L {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x);

        x.add("mohan");
        x.add("dinesh");
        x.add("vidit");
        x.add("sarvesh");
        x.add("prayag");

        System.out.println(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        Iterator y = x.iterator();

        while(y.hasNext()){
            System.out.println(y.next());
        }
    }
}