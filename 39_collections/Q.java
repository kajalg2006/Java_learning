import java.util.Hashtable;

class Q {
    public static void main(String[] args) {
        Hashtable<String,Double> map = new Hashtable<String,Double>();
        
        map.put("Mohan", 78.89);
        map.put(null, 88.12);
        map.put("Sohan", 63.54);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//         at java.base/java.util.Hashtable.put(Hashtable.java:481)
//         at Q.main(Q.java:9)
