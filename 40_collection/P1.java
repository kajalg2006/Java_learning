import java.util.Collections;
import java.util.ArrayList;

class P1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("prithvi");
        list.add("agni");
        list.add("pinaka");
        list.add("aakash");
        list.add("naag");
        list.add("brahmos");
        list.add("kusha");
        list.add("k6");

        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.println(list);

        // System.out.println(Collections.binarySearch(list, "naag"));
        System.out.println(Collections.binarySearch(list, "brahmos"));
    }
}