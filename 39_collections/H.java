import java.util.HashMap;

class H {
 public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();

        System.out.println(x);
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        System.out.println(x);
        String str = new String("Ganesh");
        System.out.println(x.containsKey(str));
    }    
}
