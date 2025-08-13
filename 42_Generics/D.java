import java.util.ArrayList;

class D {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(34);
        x.add(67);
        x.add(89);

        System.out.println(x);

     //   Integer next = x.get(2);
    }
}


// D.java:14: error: incompatible types: Object cannot be converted to Integer
//         Integer next = x.get(2);
//                             ^
// Note: D.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error