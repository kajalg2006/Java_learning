import java.util.regex.Matcher;
import java.util.regex.Pattern;

class F{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("good boy ram is in class 12th");

        System.out.println(p.pattern());
        System.out.println(m.pattern());
    }
}