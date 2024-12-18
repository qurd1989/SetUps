package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("baaaaa");
        boolean b = m.matches();
        System.out.println(b);
    }
}
