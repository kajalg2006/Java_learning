import java.util.HashSet;

class E {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}