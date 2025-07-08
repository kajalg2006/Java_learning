import java.util.HashMap;
import java.util.Set;

class P {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<String,Double>();
        
        map.put("Mohan", 78.89);
        map.put("Rohan", 88.12);
        map.put("Sohan", 63.54);
        map.put("Ganesh", 99.99);
        map.put("Mangesh", 82.59);
        
        System.out.println(map);

        //for(Object next :  map) {
            //---
        //}
    }
}
// P.java:16: error: for-each not applicable to expression type
//         for(Object next :  map) {
//                            ^
//   required: array or java.lang.Iterable
//   found:    HashMap<String,Double>
// 1 error