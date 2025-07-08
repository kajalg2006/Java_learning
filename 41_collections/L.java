import java.util.TreeSet;

class L {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        set.add(56);
        set.add(12);
        set.add(45);
        set.add(62);
        set.add(18);
        set.add(2);
        set.add(39);

        System.out.println(set);

        // Integer val = set.ceiling(41);
        Integer val = set.ceiling(39);

        System.out.println(val);
    }
}