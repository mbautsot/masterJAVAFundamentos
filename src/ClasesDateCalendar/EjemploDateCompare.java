package ClasesDateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploDateCompare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa fecha con el siguiente formato : 'yyyy-MM-dd'");
        try {
           // Date fecha = sdf.parse("2020-01-05");
            Date fecha = sdf.parse(scan.next());
            System.out.println("fecha :" + fecha);
            System.out.println("format :" + sdf.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha actual :" + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("fecha del usuario es despues de la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha del usuario es antes de la fecha actual");

            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha del usuario es igual de la fecha actual");
            }


            if(fecha.compareTo(fecha2) > 0 ){
                System.out.println("fecha  despues de la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha antes de la fecha actual");

            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("fecha igual de la fecha actual");
            }
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
