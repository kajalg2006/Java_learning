// command-line argument:  45 or om or <blank>


class I{
    public static void main(String[] args) {
        System.out.println("start");

        int val = Integer.parseInt(args[0]);
        System.out.println("end");
    }
}
// for input : om
// Exception in thread "main" java.lang.NumberFormatException: For input string: "om"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Integer.parseInt(Integer.java:786)
//         at I.main(I.java:7)

// for input: <blank>
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // at I.main(I.java:7)