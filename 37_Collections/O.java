import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        Integer[] y = new Integer[2];
        
        // Generics: Compile-time safety... will be erased after compilation
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        // non-type-safe operations are rejected at compile time
       // x.add("mohan");
        x.add(23);
       // x.add(23.5);
        x.add(9);
       // x.add(true);

        // Type-casting is exempted
        Integer z = x.get(2);
    } 
}

// O.java:11: error: incompatible types: String cannot be converted to Integer
//         x.add("mohan");
//               ^
// O.java:13: error: incompatible types: double cannot be converted to Integer
//         x.add(23.5);
//               ^
// O.java:15: error: incompatible types: boolean cannot be converted to Integer
//         x.add(true);
//               ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 3 errors