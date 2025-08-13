import java.util.ArrayList;

class B {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add("om");
        x.add(34.67);
        x.add(true);

        System.out.println(x);

        //String str = x.get(1);
    }
}

// B.java:14: error: incompatible types: Object cannot be converted to String
//         String str = x.get(1);
//                           ^
// Note: B.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error