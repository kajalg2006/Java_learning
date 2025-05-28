class X {
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

        System.out.println(x);
        System.out.println("~~~~~~~");
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);

    }
}