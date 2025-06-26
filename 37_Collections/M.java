import java.util.ArrayList;

class M {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        System.out.println(x);

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<x.size();i++) {
            System.out.println(x.get(i));
        }
    }
}