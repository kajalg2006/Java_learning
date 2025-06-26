import java.util.ArrayList;

class S {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        x.add(67);
        x.add(12);
        x.add(45);
        x.add(23);
        x.add(37);

        System.out.println(x);
                
        x.set(5, 99);
        
        System.out.println(x);
    }
}
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
//         at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//         at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//         at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//         at java.base/java.util.Objects.checkIndex(Objects.java:359)
//         at java.base/java.util.ArrayList.set(ArrayList.java:441)
//         at S.main(S.java:15)