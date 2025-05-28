public class F {
    
        F() {
    
        }    
    }
    
    abstract class X1 {
        X1() {
    
        }
    }
    
    enum X2 {
        X2() {
    
        }
    }
    
    interface X3 {
        
    }
    
    // Constructor Definition is not allowed in an interface...
    // interface X3 {
    //     X3() {
    
    //     }
    // }
    
    
    // F.java:21: error: <identifier> expected
    //     X3() {
    //       ^
    // 1 error
