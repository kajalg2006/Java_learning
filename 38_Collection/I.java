import java.util.HashSet;
import java.util.Iterator;
class I {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);

        Iterator<String> itr = set.iterator();
         
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
    }
}
