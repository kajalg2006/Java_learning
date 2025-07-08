import java.util.Arrays;
import java.util.List;
class C{
    public static void main(String[] args) {
         int[] x = {12, 56, 78};

        List<int[]> list = Arrays.asList(x);

        for(Object next : list)
            System.out.println(next); 

        System.out.println(list);
    }
}