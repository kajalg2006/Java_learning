import java.util.ArrayList;

class T1 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(7);  // index 0
        x.add(2);  // index 1
        x.add(1);  // index 2
        x.add(5);  // index 3
        x.add(8);  // index 4

        System.out.println(x);

        // Collection.remove(Object) 
        Integer t = 2;
        System.out.println(x.remove(t));

        System.out.println(x);
    }
}