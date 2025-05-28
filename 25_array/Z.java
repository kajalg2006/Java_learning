class Z {
    public static void main(String[] args) {
        String[][] x = new String[2][];

        x[0] = new String[4];
        x[1] = new String[3];

        x[0][0] = "om11";
        x[0][1] = "om12";
        x[0][2] = "om13";
        x[0][3] = "om14";

        x[1][0] = "om15";
        x[1][1] = "om16";
        x[1][2] = "om17";

        for(String[] nx : x) {
            for(String next : nx)
                System.out.print(next + " ");
            
            System.out.println();
        }    
    }    
}