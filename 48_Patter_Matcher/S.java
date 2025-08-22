import java.util.regex.Matcher;
import java.util.regex.Pattern;

class S{
     public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher m = p.matcher("my number is 7878675645 and your number is 9878984532 and prabhat's number 98099898");

        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }
}