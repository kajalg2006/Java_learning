import java.util.regex.Pattern;
import java.util.regex.Matcher;

class V {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("0[xX][0-9a-fA-F]{0,3}");
        Matcher m = p.matcher("_#0x25az9c ~^H0X9qy08 i2130xks321 ox230x57345Aj");

        System.out.println("_#0x25az9c ~^H0X9qy08 i2130xks321 ox230x57345Aj");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while(m.find()) {
            System.out.println(m.start() + " - " + m.end() + " - " + m.group());
        }
    }    
}