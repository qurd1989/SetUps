package w3Resource;

import java.nio.charset.Charset;
import java.text.DecimalFormat;

public class Exercise40 {

    public static void main(String[] args) {

        System.out.println("Elmar");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);

        }
    }
}
