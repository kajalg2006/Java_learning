import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

class P1 {
    public static void main(String[] args) {
         HashMap<String,Double> map = new HashMap<String,Double>();
        
        map.put("Mohan", 78.89);
        map.put("Rohan", 88.12);
        map.put("Sohan", 63.54);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);

        Set<Map.Entry<String,Double>> set= map.entrySet();

        
        for(Map.Entry next : set) {
            System.out.println(next.getKey() + " ~ " + next.getValue());
        }
    }
}
