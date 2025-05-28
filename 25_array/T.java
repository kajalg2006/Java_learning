class T {
    public static void main(String[] args) {        
        int[][] y = new int[2][3];

        
        System.out.println(y[0][0]);
        System.out.println(y[0][1]);
        System.out.println(y[0][2]);
        System.out.println(y[1][0]);
        System.out.println(y[1][1]);
        System.out.println(y[1][2]);
        System.out.println("~~~~~~~~~~~~~~~~");

        y[0][0] = 11;
        y[0][1] = 25;
        y[0][2] = 34;

        y[1][0] = 97;
        y[1][1] = 19;
        y[1][2] = 22;

        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(y[0][0]);
        System.out.println(y[0][1]);
        System.out.println(y[0][2]);
        System.out.println(y[1][0]);
        System.out.println(y[1][1]);
        System.out.println(y[1][2]);
    }    
}