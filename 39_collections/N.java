import java.util.HashMap;

class N {
    public static void main(String[] args) {
        HashMap<String,Double> x = new HashMap<String,Double>();
        
        x.put("Mohan", 78.89);
        x.put("Rohan", 88.12);
        x.put("Sohan", 63.54);
        x.put("Ganesh", 99.99);
        x.put("Mangesh", 82.59);
        
        System.out.println(x);

        String y = new String("Sohan");
        System.out.println(x.get(y));

        System.out.println(x);
    }
}