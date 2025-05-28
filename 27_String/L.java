class L {
    public static void main(String[] args) {
        String x = "mohan";

        char a = x.charAt(5);

        System.out.println(a);
    }    
}

// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:1519)
//         at L.main(L.java:5)