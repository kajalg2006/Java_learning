 class S{
 public static void main(String[] args) {
        String[][] arr = new String[3][2];

        
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println("~~~~~~~~~~~");

        arr[0][0] = "chotabheem";
        arr[0][1] = "raju";
        arr[1][0] = "kirmada";
        arr[1][1] = "indumati";
        arr[2][0] = "chutki";
        arr[2][1] = "dholu";

        System.out.println("~~~~~~~~~~~");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
    }
}