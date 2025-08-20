import java.util.regex.Matcher;
import java.util.regex.Pattern;

class G{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("good boy ram is in class 12th and ram is my friend and ram sings well");

        // System.out.println(m.start());
        // System.out.println(m.end());
        System.out.println(m.group());

    }
}


// Exception in thread "main" java.lang.IllegalStateException: No match found
//         at java.base/java.util.regex.Matcher.group(Matcher.java:644)
//         at java.base/java.util.regex.Matcher.group(Matcher.java:603)
//         at G.main(G.java:11)