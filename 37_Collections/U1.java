import java.util.ArrayList;

class U1 {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        System.out.println(x);

        x.add("mohan");
        x.add("sohan");
        x.add("rohan");
        x.add("gohan");
        x.add("tohan");

        System.out.println(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~");
        
        int size = x.size();
        for(int i = 0; i < size; i++) {
            System.out.println(x.remove(i));
            // x.remove(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~");

        System.out.println(x);
    }
}



// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.remove(ArrayList.java:504)
//         at U1.main(U1.java:21)