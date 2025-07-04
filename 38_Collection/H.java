import java.util.HashSet;

class H {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<String>();
         set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);

        for(int i=0; i < set.size(); i++) {
            //System.out.println(set.get(i));
        }
    }
}
// H.java:15: error: cannot find symbol
//             System.out.println(set.get(i));
//                                   ^
//   symbol:   method get(int)
//   location: variable set of type HashSet<String>
// 1 error