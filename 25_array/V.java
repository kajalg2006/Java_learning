class V {
    public static void main(String[] args) {
        String[][] x = new String[2][];

        x[0] = new String[4];
        x[1] = new String[3];

        x[0][0] = "om1";
        x[0][1] = "om2";
        x[0][2] = "om3";
        x[0][3] = "om4";

        x[1][0] = "om5";
        x[1][1] = "om6";
        x[1][2] = "om7";

        System.out.print(x[0][0] + " ");
        System.out.print(x[0][1] + " ");
        System.out.print(x[0][2] + " ");
        System.out.println(x[0][3]);

        System.out.print(x[1][0] + " ");
        System.out.print(x[1][1] + " ");
        System.out.print(x[1][2]);
    }    
}