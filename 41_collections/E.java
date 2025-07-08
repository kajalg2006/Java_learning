import java.util.Arrays;
import java.util.List;

class E {
    public static void main(String[] args) {
        int[] x = {12, 56, 78};

        List<int[]> list = Arrays.asList(x);

        for(int next : x)
            System.out.print(next + " # "); 
        
        list.get(0)[1] = 100; 
        System.out.println("\n");
        
        for(int next : x)
            System.out.print(next + " # "); 
         
    } 
}