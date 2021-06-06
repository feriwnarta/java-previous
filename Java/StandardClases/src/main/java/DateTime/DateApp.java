package DateTime;

import java.util.Calendar;
import java.util.Date;

class DateApp {
    public static void main(String[] args) {
        Date time = new Date();
        Calendar kalender = Calendar.getInstance();
        
        Date result = kalender.getTime();
        System.out.println(result);

    }
}
