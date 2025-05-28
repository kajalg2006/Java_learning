class C{
    public static void main(String[] args) {
        System.out.println("start");

        int arr[] ={2,4,5};
       System.out.println(arr[3]);
        System.out.println("end");
    }
}

// start
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//         at C.main(C.java:6)