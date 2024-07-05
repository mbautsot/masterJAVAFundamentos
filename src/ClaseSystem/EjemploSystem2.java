package ClaseSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploSystem2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date fecha_actual = new Date();

        System.out.println("Ingresa tu fecha de nacimiento: ");
        try {
            Date fecha_nac = sdf.parse(scan.next());
            System.out.println("fecha nacimiento :" +fecha_nac);
            System.out.println("fecha actual :" + fecha_actual);

            int yearActual = fecha_actual.getYear();
            int yearFechaNac = fecha_nac.getYear();

            int edad = yearActual - yearFechaNac;

            System.out.println("Tu edad es :"+ edad);

        }catch (ParseException e){
            System.err.println("ERROR :" + e.getMessage());
            System.out.println("El formado debe ser 'yyyy-MM-dd'");
            //System.exit(1);//Cdigo de error
            main(args); ///PARA EJECUTARLO NUEVAMENTE
        }
    }
}
