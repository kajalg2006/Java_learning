import java.util.HashSet;

public class N {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        set.add(14);
        set.add(81);
        set.add(14);
        set.add(34);
        set.add(14);
        set.add(87);

        System.out.println(set);
    }
}
