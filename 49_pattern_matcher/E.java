import java.util.regex.Matcher;
import java.util.regex.Pattern;

class E {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d\\d");
        
        Matcher m = p.matcher("3256 is my score");
        // Matcher m = p.matcher("0056 is my score");
        // Matcher m = p.matcher("3 is my score");
        // Matcher m = p.matcher("a33 is my score");

        System.out.println(m.lookingAt());
    }
}