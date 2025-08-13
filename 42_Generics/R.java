import java.util.ArrayList;

class R {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(34);
        x.add(67);
        x.add(23);

        pro(x);
    }   
    
    // old code...
    static void pro(ArrayList list) {
        System.out.println(list);

        list.add("om");
        list.add(true);
        list.add(34.56);

        System.out.println(list);
    }
}