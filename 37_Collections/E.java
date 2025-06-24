// Dupliacte records are allowed

import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        
        x.add(45);
        x.add(23);
        x.add(13);
        x.add(67);
        x.add(23);
        x.add(89);
        x.add(12);
        x.add(23);

        System.out.println(x);
    }
}