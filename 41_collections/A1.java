import java.util.TreeSet;

class A1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);

        Object[] arr = set.toArray();

        for(Object next : arr)
            System.out.print(next.length() + " ~  " + next);
    }
}


// PS C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\41_collections> javac A1.java
// A1.java:19: error: cannot find symbol
//             System.out.print(next.length() + " ~  " + next);
//                                  ^
//   symbol:   method length()
//   location: variable next of type Object
// 1 error