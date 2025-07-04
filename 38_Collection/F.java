import java.util.HashSet;
class F {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);

        // String x = new String("vineet");
        String x = new String("yamraj");
        System.out.println(set.remove(x));        
        
        System.out.println(set);

    }
}
