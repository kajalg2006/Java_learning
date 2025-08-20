import java.util.regex.Matcher;
import java.util.regex.Pattern;

class I {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ram");
        Matcher m = p.matcher("good boy ram is in class 12th and ram is my friend and ram and ram");

        while (m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }

    }
}