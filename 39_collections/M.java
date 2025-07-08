import java.util.HashMap;

class M {
     public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        System.out.println(x);        

        x.put(null, 99.99);
        System.out.println(x);

        x.put("Sohan", null);
        System.out.println(x);

        x.put("Ganesh", 82.11);
        System.out.println(x);

        x.put(null, 45.98);
        System.out.println(x);

        x.put("Vidit", 87.78);
        System.out.println(x);
        
        x.put(null, 11.11);
        System.out.println(x);
    }
}
