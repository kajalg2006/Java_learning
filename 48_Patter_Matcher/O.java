import java.util.regex.Matcher;
import java.util.regex.Pattern;

class O{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher("@*t$_#!9 J&^");

         while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }
}