import java.util.ArrayList;

class D2 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(12);
        x.add(34);
        x.add(67);
        x.add(89);

        System.out.println(x);

        Integer next = x.get(3);

        System.out.println(next);
    }
}