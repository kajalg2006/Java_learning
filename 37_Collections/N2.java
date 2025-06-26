import java.util.ArrayList;

class N2 {
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
        
        for(Object next : x) {
            //System.out.println(next.length());
        }
    }
}
// S C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\37_Collections> javac N2.java
// N2.java:20: error: cannot find symbol
//             System.out.println(next.length());
//                                    ^
//   symbol:   method length()
//   location: variable next of type Object
// Note: N2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error