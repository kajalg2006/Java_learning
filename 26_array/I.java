class I {
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

        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                for(int k=0;k<x[i][j].length;k++)
                    System.out.print(x[i][j][k] + " ");
                System.out.println();
            }
            System.out.println("~~~~~~~");
        }
    }    
}