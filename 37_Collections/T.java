import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();

        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);

        System.out.println(x);

        // List.remove(int) => int->index
        System.out.println(x.remove(2));

        System.out.println(x);

    }
}
