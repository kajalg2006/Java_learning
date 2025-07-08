import java.util.TreeSet;

class B2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);


        String[] ar = new String[0];
        String[] arr = set.toArray(ar);

        for(String next : arr)
            System.out.print(next.length() + " --  " + next);
    }
}


// B2.java:18: error: incompatible types: Object[] cannot be converted to String[]
//         String[] arr = set.toArray(ar);
//                                   ^
// Note: B2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error