import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringToDateConvert {
    public static void main(String[] args) throws ParseException {
        String dateInString = "24-May-2021 9:45:30 AM";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss a");
        Date date = dateFormat.parse(dateInString);
        System.out.println(date);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy h:mm:ss a", Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.parse(dateInString, formatter);
        System.out.println(localDateTime);
    }
}
