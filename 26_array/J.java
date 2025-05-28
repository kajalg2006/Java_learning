class J {
    public static void main(String[] args) {
        int[][][] x = {
                        {
                            {3,4,5},
                            {11,12},
                            {55,56,57,58}
                        },
                        {
                            {5,6},
                            {7,8,9,10,11}
                        },
                        {
                            {1,2,3,4},
                            {99}
                        }
                    };

        
        for(int[][] i : x) {
            for(int[] j : i) {
                for(int k : j) {
                    System.out.print(k + "- ");
                }        
                System.out.println();
            }            
            System.out.println("^^^^^^^^");    
        }            
    }    
}