import java.util.Scanner;

class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] x = new int[3][4][2];

        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                for(int k=0;k<x[i][j].length;k++)
                    System.out.print(x[i][j][k] + " ");
                System.out.println();
            }
            System.out.println("~~~~~~~");
        }

        System.out.println("~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~");

        for(int i=0;i<x.length;i++) 
            for(int j=0;j<x[i].length;j++) 
                for(int k=0;k<x[i][j].length;k++)
                    x[i][j][k] = sc.nextInt();
        
        sc.close();

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