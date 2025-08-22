import java.util.regex.Pattern;
import java.util.regex.Matcher;

class S2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher m = p.matcher("my number is 2878675645 and your number is 9878984532 and prabhat's number 98099898");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}