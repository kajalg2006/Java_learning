import java.util.HashMap;

class L {
    public static void main(String[] args) {
        HashMap<String, Double> x = new HashMap<String, Double>();

        System.out.println(x.put("Mohan", 78.89));
        System.out.println(x.put("Sohan", 56.67));

        System.out.println(x);

        System.out.println(x.put("Mohan", 82.11));

        System.out.println(x);
    }
}
