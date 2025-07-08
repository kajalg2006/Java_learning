import java.util.Hashtable;

class R {
    public static void main(String[] args) {
        Hashtable<String,Double> map = new Hashtable<String,Double>();
        
        map.put("Mohan", 78.89);
        map.put("Rohan", 88.12);
        map.put("Sohan", null);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);
    }
}
// Exception in thread "main" java.lang.NullPointerException
//         at java.base/java.util.Hashtable.put(Hashtable.java:476)
//         at R.main(R.java:9)
