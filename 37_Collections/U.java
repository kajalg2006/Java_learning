import java.util.ArrayList;

class U {
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

        for(int i =0; i<x.size();i++){
            System.out.println(x.remove(i));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(x);
    }
}