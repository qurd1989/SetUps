package dates;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Localtime {
    public static String toDayPeriod(Date date, ZoneId zoneId) {
        LocalTime it = date.toInstant().atZone(zoneId).toLocalTime();
        LocalTime morning = LocalTime.of(4, 0, 0);
        LocalTime afterNoon = LocalTime.of(12, 0, 0);
        LocalTime evening = LocalTime.of(16, 0, 0);
        LocalTime night = LocalTime.of(20, 0, 0);
        LocalTime midnight = LocalTime.of(0, 0, 0);
        if (it.isAfter(morning) && it.isBefore(afterNoon)) {
            return "Morning";
        } else if (it.isAfter(afterNoon) && it.isBefore(evening)) {
            return "Afternoon";
        } else if (it.isAfter(evening) && it.isBefore(night)) {
            return "Evening";
        } else if (it.isAfter(night) && it.isBefore(midnight)) {
            return "Night";
        } else {
            return "Day";
        }
    }

    public static void main(String[] args) {
        Date date = new Date();
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(toDayPeriod(date, zoneId));

    }
}


