package ClasesDateCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        Date fecha1 = calendario.getTime();
        System.out.println("calandario :" + fecha1);

        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(2025, 0, 10);
        Date fecha2 = calendario2.getTime();
        System.out.println("set fecha2 calendar --->" +fecha2);


        Calendar calendario3 = Calendar.getInstance();
        calendario3.set(Calendar.YEAR,2026);
        calendario3.set(Calendar.MONTH, Calendar.JULY);
        calendario3.set(Calendar.DAY_OF_MONTH,25);

        ///Horas
        calendario3.set(Calendar.HOUR_OF_DAY,21);
        calendario3.set(Calendar.MINUTE,20);
        calendario3.set(Calendar.SECOND,23);
        calendario3.set(Calendar.MILLISECOND,14);

        Date fecha3 = calendario3.getTime();
        System.out.println("set fecha3 calendar ---> " +fecha3);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaformat = sdf.format(fecha3);
        System.out.println("Fecha Formato: "+ fechaformat);

        /*
            calandario :Wed Jul 03 21:23:54 CST 2024
            set fecha2 calendar --->Fri Jan 10 21:23:54 CST 2025
            set fecha3 calendar ---> Sat Jul 25 21:20:23 CST 2026
            Fecha Formato: 2026-07-25 21:20:23:014 p.m.
         */
    }
}
