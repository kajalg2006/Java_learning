import java.util.TreeSet;
import java.util.SortedSet;

class J {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);

        // SortedSet<String> x = set.headSet("manoj");
        SortedSet<String> x = set.headSet("ekta");

        System.out.println(x);
    }
}