class B{
    public static void main(String[] args) {
        System.out.println("start");

        String x =null;
       System.out.println(x.length());
        System.out.println("end");
    }
}

// start
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//         at B.main(B.java:6)