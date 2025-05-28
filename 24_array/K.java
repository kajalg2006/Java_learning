public class K {
    public static void main(String[] args) {

        String[] y = new String[4];

        for(int i =0; i<y.length;i++){
            System.out.println(y[i]);
        }

        y[0] = "mohan";
        y[1] = new String("om");
        y[2] = new String("golu");
        y[3] = new String("raju");

        System.out.println("~~~~~~~~~~~~~~~");

       
        for(int i =0; i<y.length;i++){
            System.out.println(y[i]);
        }
    }
}
