import java.util.HashSet;

public class J {
       public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");

        System.out.println(set);

        for(String next : set){
            System.out.println(next);
        }
    }
}
