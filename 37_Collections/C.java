import java.util.ArrayList;

public class C {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());

        x.add(12);
        x.add(13);
        x.add(99);
        x.add(79);
        x.add(89);

        System.out.println(x);
        System.out.println(x.isEmpty());
        System.out.println(x.size());


    }
}
