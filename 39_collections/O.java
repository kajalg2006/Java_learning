import java.util.HashMap;
import java.util.Set;

class O {
    public static void main(String[] args) {
        HashMap<String , Double> map = new HashMap<String, Double>();

        map.put("Mohan", 78.89);
        map.put("Rohan", 88.12);
        map.put("Sohan", 63.54);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);

        Set<String> keySet = map.keySet();
        for(String nextKey : keySet) {
            System.out.println(nextKey + " - " + map.get(nextKey));
        }
    }
}
