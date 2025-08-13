import java.util.ArrayList;
class B1 {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(12);
        x.add("om");
        x.add(34.67);
        x.add(true);

        System.out.println(x);

        String str = (String)x.get(1);

        System.out.println(str);
    }
}