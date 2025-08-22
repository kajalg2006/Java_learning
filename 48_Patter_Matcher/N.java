import java.util.regex.Pattern;
import java.util.regex.Matcher;

class N {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("\\d\\d");
        Pattern p = Pattern.compile("[0-9][0-9]");
        Matcher m = p.matcher("om is in class 7th and he scored 82% (734)");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}