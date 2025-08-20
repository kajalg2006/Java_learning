import java.util.regex.Pattern;

class E{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("om");

        System.out.println(p);
        System.out.println(p.toString());
    }
}