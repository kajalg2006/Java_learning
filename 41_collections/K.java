import java.util.TreeSet;
import java.util.SortedSet;

class K {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);

        // SortedSet<String> x = set.tailSet("manoj");
        SortedSet<String> x = set.tailSet("nishant");

        System.out.println(x);
    }
}