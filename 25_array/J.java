public class J {
    public static void main(String[] args) {
        int[] x = {45, 62, 97, 23, 41, 22, 81, 16};

        int count = 0;

        for(int nx : x)
            if(nx % 2 == 1)
                System.out.println(nx);
            else
                count++;

        System.out.println("Even Records: " + count);        
    }    
} 
