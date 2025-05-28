public class V {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int sum = 0;
        
        for(int next  : x)
            sum += next;
            
        System.out.println(sum);
    }    
} 
