import java.util.TreeSet;

class A {
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
            System.out.print(next + " ~ ");
    }
}