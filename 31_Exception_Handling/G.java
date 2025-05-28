class G{
    public static void main(String[] args) {
        System.out.println("start");

        int arr[] ={2,4,5};
        try{

            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("some problem");

        }
        System.out.println("end");
    }
}