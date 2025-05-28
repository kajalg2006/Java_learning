public class C {
     
        C(int y) {
            System.out.println("HI");
        }
        public static void main(String[] args) {
            // C x = new C();    // not ok
            C x = new C(23);   // ok
    
            System.out.println(x);
        }    
    }
    
    
    
    
    
    // C.java:7: error: constructor C in class C cannot be applied to given types;
    //         C x = new C();
    //               ^
    //   required: int
    //   found:    no arguments
    //   reason: actual and formal argument lists differ in length
    // 1 error
