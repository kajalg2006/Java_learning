class YY2{
    YY2(int x){

    }
}

// class V2 extends YY2{
//     V2(){
//        /*now error shows here which is main cause of the error  */ super();
//     }
//     public static void main(String[] args) {
//         System.out.println("A");
//         V2 x = new V2();
//         System.out.println("B");
//     }    
    
// }


// V2.java:9: error: constructor YY2 in class YY2 cannot be applied to given types;
//         super();
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error