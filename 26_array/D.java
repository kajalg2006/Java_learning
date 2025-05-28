class D {
    public static void main(String[] args) {
        int[][] x = {{11},{12,13},{14,15,16},{17,18,19,20}};

        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }    
}