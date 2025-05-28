class YY{
    YY (int a){
        System.out.println("hello");
    }
}


// class /*error shows in V*/ V extends YY {
//     public static void main(String[] args) {
//         System.out.println("A");
//         V x = new V();
//         System.out.println("B");
//     }    
// }

// v.java:8: error: constructor YY in class YY cannot be applied to given types;
// class V extends YY {
// ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
