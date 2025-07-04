import java.util.HashMap;

class I {
    public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        Double dbl = 63.54;
        // Double dbl = 11.11;
        System.out.println(x.containsValue(dbl));
    }
}