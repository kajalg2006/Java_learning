import java.util.ArrayList;
import java.util.Collections;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(92);
        list.add(57);
        list.add(11);
        list.add(9);
        list.add(61);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
