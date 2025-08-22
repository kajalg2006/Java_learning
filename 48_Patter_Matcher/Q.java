import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Q {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^myrt]");
        Matcher m = p.matcher("myamar");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}