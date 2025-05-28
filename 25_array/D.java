class D {
    public static void main(String[] args) {
        char a = 'B';
        byte b = 34;
        short c = 89;
        int d = 102;
        long e = 899L;
        float f = 7.8f;
        double g = 88.9;

        int[] x = {a, b, c, d, /*e, f, g*/};
        
        for(int next : x)
            System.out.println(next); 
    }
}

// PS C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\25_array> javac D.java
// D.java:11: error: incompatible types: possible lossy conversion from long to int
//         int[] x = {a, b, c, d, e, f, g};
//                                ^
// D.java:11: error: incompatible types: possible lossy conversion from float to int
//         int[] x = {a, b, c, d, e, f, g};
//                                   ^
// D.java:11: error: incompatible types: possible lossy conversion from double to int
//         int[] x = {a, b, c, d, e, f, g};
//                                      ^
// 3 errors

