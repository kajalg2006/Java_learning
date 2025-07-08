import java.util.LinkedHashMap;
import java.util.HashMap;

class S {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> map = new LinkedHashMap<String,Double>();
        // HashMap<String,Double> map = new HashMap<String,Double>();
        
        map.put("Mohan", 78.89);
        map.put("Rohan", 88.12);
        map.put("Sohan", null);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);
    }
}