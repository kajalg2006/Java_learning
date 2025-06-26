import java.util.ArrayList;
class P {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
         
        x.add(67);
        x.add(12);
        x.add(45);
        x.add(23);
        x.add(37);

        System.out.println(x);
        
        //insert
        x.add(2,23);
        System.out.println(x); 
    }
}
