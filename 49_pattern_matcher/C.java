import java.util.regex.Pattern;
import java.util.regex.Matcher;

class C {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher("my email: hitesh_234.32@gmail.com and your email: golu_23@altavista.com and his email is: raju007@tcs.com");
    
        System.out.println(m.find());
        System.out.println(m.matches());
    }    
}