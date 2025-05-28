public class K {
    public static void main(String[] args) {
        int[] x = {45, 62, 97, 18, 41, 22, 81, 16};

        int count = 0;

        for(int nx : x) {
            if(nx % 2 == 0) {
                count++;
                continue;
            }

            System.out.println(nx);
        }

        System.out.println("Even Records: " + count);        
    }    
} 
