import java.io.Console;

class A {
    public static void main(String[] args) {
        Console con = System.console();
        String[][] x = new String[3][4];
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                x[i][j] = con.readLine();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }
}
