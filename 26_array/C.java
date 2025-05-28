class C {
    public static void main(String[] args) {
        
        String[][] x = {{"om","ram","ganesh"},{"dholu","bholu"},{"vigyan","agyan","sugyan","pragyan"}};

        
        System.out.println("~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }
}