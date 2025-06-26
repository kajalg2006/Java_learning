import java.util.ArrayList;

class N1 {
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
        
        for(Object next : x) {
            System.out.println(next);
        }
    }
}