package ClasesDateCalendar;

import java.io.FilterOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingresa fecha con el siguiente formato : 'yyyy-MM-dd'");
        try {
           // Date fecha = sdf.parse("2020-01-05");
            String fechastr = scan.nextLine();
            Date fecha = sdf.parse(fechastr);
            System.out.println("fecha :" + fecha);
            System.out.println("format :" + sdf.format(fecha));

        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
