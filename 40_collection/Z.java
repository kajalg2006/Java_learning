import java.util.TreeSet;

class Z {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(56);
        set.add(13);
        set.add(87);
        set.add(9);
        set.add(23);

        System.out.println(set);

        Object[] arr = set.toArray();

        for(Object next : arr)
            System.out.print(next + "  ");
    }
}