import java.util.TreeSet;

class H {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);
        System.out.println(set.first());
    }
}