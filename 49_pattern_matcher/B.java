import java.util.regex.Pattern;
import java.util.regex.Matcher;

class B {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        // Matcher m = p.matcher("my email: hitesh234.32@gmail.com and your email: golu_23@altavista.com and his email is: raju007@tcs.com");
        // Matcher m = p.matcher("my email: hitesh234.32@gmail.com and your email: golu_23@altavista.com and his email is: raju007@tcs");
        Matcher m = p.matcher("my email: hitesh 234.32@gmail.com and your email: golu_23@altavista.com and his email is: raju007@tcs");

        System.out.println("_a7kRxx9i 12exx50 &^Eq2");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}