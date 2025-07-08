import java.util.Arrays;
import java.util.List;

class C2 {
    public static void main(String[] args) {
        int[] x = {12, 56, 78};

        List<int[]> list = Arrays.asList(x);

        for(int[] next : list)
            for(int nx : next)
                System.out.println(nx); 
    } 
}