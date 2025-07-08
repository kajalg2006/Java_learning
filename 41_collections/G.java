import java.util.Arrays;
import java.util.List;

class G {
    public static void main(String[] args) {
        int[] x = {12, 56, 78};

        List<int[]> list = Arrays.asList(x);

        for(int next : x)
            System.out.print(next + " # "); 
        
        list.remove(0); 
        System.out.println("\n");
        
        for(int next : x)
            System.out.print(next + " # ");          
    } 
}



// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.remove(AbstractList.java:167)
//         at G.main(G.java:13)