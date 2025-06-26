import java.util.ArrayList;

class M1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x);

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<x.size();i++) {
            //System.out.println(x.get(i).length());
        }
    }
}

// M1.java:20: error: cannot find symbol
//             System.out.println(x.get(i).length());
//                                        ^
//   symbol:   method length()
//   location: class Object
// Note: M1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error