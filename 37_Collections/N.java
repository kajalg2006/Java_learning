import java.util.ArrayList;

class N {
    public static void main(String[] args) {
        ArrayList x =new ArrayList();
        System.out.println(x);

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        
        // for(String next : x) {
        //     System.out.println(next);
        // }

    }
}

// N.java:19: error: incompatible types: Object cannot be converted to String
//         for(String next : x) {
//                           ^
// Note: N.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error