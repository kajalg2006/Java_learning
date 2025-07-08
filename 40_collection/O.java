import java.util.Collections;
import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(92);
        list.add(57);
        list.add(11);
        list.add(9);
        list.add(61);
        
        System.out.println(list);

        // int index = Collections.binarySearch(list, 57);
        int index = Collections.binarySearch(list, 9);

        System.out.println(index);
    }
}