package w3Resource;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exerccise45 {


    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        SimpleDateFormat dtf = new SimpleDateFormat("EE/MMMM/yy  hh:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(dtf.format(date));

        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

    }
}
