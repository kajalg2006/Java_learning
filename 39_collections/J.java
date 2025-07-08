import java.util.HashMap;

class J {
     public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        System.out.println(x);

        String str = new String("Mohan");
        // String str = new String("Yamraj");
        System.out.println(x.remove(str));

        System.out.println(x);
    }
}
