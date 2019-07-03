package main.java.com.stackroute.junit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class week {
    public boolean startDate() {
        Calendar calendar = Calendar.getInstance();

// Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
     //   System.out.println(df.format(calendar.getTime()));
        String s1 = df.format(calendar.getTime());
        if (s1.equals("Mon 01/07/2019"))
            return true;
        else
            return false;

    }

    public boolean endDate() {
        Calendar calendar = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        calendar.add(Calendar.DATE, 6);
        s2 = (df.format(calendar.getTime()));
        if (s2.equals("Sun 07/07/2019"))
            return true;
        else
            return false;

    }
}
