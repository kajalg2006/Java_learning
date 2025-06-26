import java.util.ArrayList;

class U2 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        System.out.println(x);

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~");
        
        int size = x.size();
        for(int i = 0; i < size; i++) {
            System.out.println(x.remove(0));
            // x.remove(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        System.out.println(x);
    }
}
