import java.util.Arrays;
import java.util.List;

class F {
    public static void main(String[] args) {
        int[] x = {12, 56, 78};

        List<int[]> list = Arrays.asList(x);

        for(int next : x)
            System.out.print(next + " # "); 
        
        list.add(new int[]{1,2,3}); 
        System.out.println("\n");
        
        for(int next : x)
            System.out.print(next + " # "); 
         
    } 
}


// Exception in thread "main" java.lang.UnsupportedOperationException
//         at java.base/java.util.AbstractList.add(AbstractList.java:153)
//         at java.base/java.util.AbstractList.add(AbstractList.java:111)
//         at F.main(F.java:13)