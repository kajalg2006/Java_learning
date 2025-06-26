import java.util.ArrayList;

class R {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        x.add(67);
        x.add(12);
        x.add(45);
        x.add(23);
        x.add(37);

        System.out.println(x);
                
        // x.add(5, 99);
        x.add(6, 99);
        
        System.out.println(x);
    }
}


// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
//         at java.base/java.util.ArrayList.rangeCheckForAdd(ArrayList.java:756)
//         at java.base/java.util.ArrayList.add(ArrayList.java:481)
//         at R.main(R.java:16)