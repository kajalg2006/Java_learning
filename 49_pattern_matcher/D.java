import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher("hitesh_234.32@gmail.com");
    
        System.out.println(m.find());
        System.out.println(m.matches());
    }    
}