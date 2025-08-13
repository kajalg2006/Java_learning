import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        list.add("ram");
        list.add(false);
        list.add('A');

        pro(list);
    }

    static void pro(ArrayList<Integer> x) {
        System.out.println(x);

        x.add(45);
        x.add(78);
        // x.add("89");

        System.out.println(x);
    }
}