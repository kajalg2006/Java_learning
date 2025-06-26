import java.util.ArrayList; 
class Q {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
         
        x.add(67);
        x.add(12);
        x.add(45);
        x.add(23);
        x.add(37);

        System.out.println(x);
        
        //replace
        x.set(2,23);
        System.out.println(x); 
    }
}
