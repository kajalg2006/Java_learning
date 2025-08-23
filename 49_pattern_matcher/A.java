import java.util.regex.Pattern;
import java.util.regex.Matcher;

class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".+?xx");
        Matcher m = p.matcher("_a7kRxx9i 12exx50 &^Eq2");

        System.out.println("_a7kRxx9i 12exx50 &^Eq2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}