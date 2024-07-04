package ClasesDateCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("Fecha : " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("E dd 'de' MMMM, yyyy");
        String fechastr = df.format(fecha);
        System.out.println("fecha sdf :"+ fechastr); //fecha sdf :03 julio 2024 (dd MMMM yyyy)
        System.out.println("fecha sdf :"+ fechastr); //fecha sdf :03 07 2024 (dd MM yyyy)
        System.out.println("fecha sdf :"+ fechastr); //fecha sdf :mié. 03 de julio, 2024 (E dd 'de' MMMM, yyyy)


        long j = 0;
        for (int i = 0; i < 10000000; i++) {

            j+=i;
        }
        System.out.println(" j = "+ j);

        Date fecha2 = new Date();
        long duracion = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido :" + duracion);


    }
}
