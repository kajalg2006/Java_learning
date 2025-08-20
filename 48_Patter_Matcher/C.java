import java.util.regex.Matcher;
import java.util.regex.Pattern;

class C{
    public static void main(String[] args) {
        Pattern p  = Pattern.compile("mohan");
        Matcher m = p.matcher("student mohan is in class 10th");

        boolean flag = m.find();
         if(flag) {
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
        }
    }
}