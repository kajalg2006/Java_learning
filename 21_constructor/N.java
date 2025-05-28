class ZA{
    ZA(){
        System.out.println("M");
    }
}
class ZB extends ZA {
    ZB() {    int y = 2/0;      System.out.println("A");  }    
}

class ZC extends ZB {
    ZC() {        System.out.println("U");  }    
}
class N {
    public static void main(String[] args) {
        System.out.println("R");
        
        ZC a = new ZC();
        
        System.out.println("G");
    }

}


// PS C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\21_constructor> javac N.java
// PS C:\Users\Dell\OneDrive\文档\kajal's Folder\java_course\21_constructor> java N
// R
// M
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at ZB.<init>(N.java:7)
//         at ZC.<init>(N.java:11)
//         at N.main(N.java:17)

// THis error will come at runtime
