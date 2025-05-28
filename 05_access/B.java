class B{
    int y= 9999;
    public static void main(String[] args) {
       // System.out.println(y);
    }
}

class B2{
    int y =99;
}
// B.java:4: error: non-static variable y cannot be referenced from a static context
//         System.out.println(y);
//                            ^
// 1 error