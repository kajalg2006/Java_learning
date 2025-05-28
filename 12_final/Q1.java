public class Q1 {
    public static void main(String[] args) {
        final int j;    // uninitialized variable

        j = 29;

        System.out.println(j);

      //  j = 78;
    }    
}


// Q1.java:9: error: variable j might already have been assigned
//         j = 78;
//         ^
// 1 error {
    

