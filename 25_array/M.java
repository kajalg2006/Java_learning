class M {
    public static void main(String[] args) {
        int[] x = {45, 62, 97, 18, 41, 22, 81, 16};

        int max = x[0];

        for(int i=1;i<x.length;i++)
            if(x[i] > max)
                max = x[i];
        
        System.out.println(max);    
    }

}
