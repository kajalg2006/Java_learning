import java.util.ArrayList;

class D1 {
     public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add(34);
        x.add(67);
        x.add(89);

        System.out.println(x);

        Integer next = (Integer)x.get(2);

        System.out.println(next);
     }
}
