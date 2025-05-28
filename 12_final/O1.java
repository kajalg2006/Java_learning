 class O1 {
    void pro() {
        int e;  //uninitialized variable
        int w = 9;

        //System.out.println(e);
        System.out.println(w);
    }  
    public static void main(String[] args) {
        O1 a = new O1();

        a.pro();
    }
}

// O1.java:6: error: variable e might not have been initialized
//         System.out.println(e);
//                            ^
// 1 error