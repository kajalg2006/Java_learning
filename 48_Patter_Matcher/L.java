import java.util.regex.Matcher;
import java.util.regex.Pattern;

class L {
    public static void main(String[] args) {
        Pattern p  = Pattern.compile("aba");
        Matcher m = p.matcher("abaaaaba");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }
}
