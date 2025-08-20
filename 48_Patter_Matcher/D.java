import java.util.regex.Matcher;
import java.util.regex.Pattern;

class D{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");
        Matcher m = p.matcher("good boy om is in class 12th");

        System.out.println(m);

        m.find();

        System.out.println(m);
    }    
}