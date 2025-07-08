import java.util.TreeSet;

public class B1 {
    public static void main(String[] args) {
          TreeSet<String> set = new TreeSet<String>();

        set.add("sarvan");
        set.add("gitesh");
        set.add("manoj");
        set.add("vikas");
        set.add("bijendra");
        set.add("deepak");

        System.out.println(set);


        String[] ar = new String[0];
        String[] arr = set.toArray(ar);

        System.out.println(ar == arr);

        for(String next : ar)
            System.out.print(next.length() + " ^  " + next);
    
    }
}
