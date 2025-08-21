import java.util.regex.Pattern;
import java.util.regex.Matcher;

class J {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");
        Matcher m = p.matcher("good boy ram is in class 12th and ram is my friend and ram and ram");
       
        System.out.println(m.find());
        System.out.println(m.start());
    }    
}

// false
// Exception in thread "main" java.lang.IllegalStateException: No match available
//         at java.base/java.util.regex.Matcher.start(Matcher.java:450)
//         at J.main(J.java:10)