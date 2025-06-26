import java.util.ArrayList;
import java.util.Iterator;

class L1 {
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
           // System.out.println(y.next().length());
        }
    }
}
// L1.java:23: error: cannot find symbol
//             System.out.println(y.next().length());
//                                        ^
//   symbol:   method length()
//   location: class Object
// Note: L1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error