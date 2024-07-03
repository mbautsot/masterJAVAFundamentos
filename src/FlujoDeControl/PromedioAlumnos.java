package FlujoDeControl;

import java.util.HashMap;
import java.util.Scanner;

public class PromedioAlumnos {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int x = 20;

       Double[] calificaciones = new Double[x];
        double calfscan = 0;
       // System.out.println("cal :" + calificaciones.length);

        int notamenor5 = 0;
        int notamenor4 = 0;
        int nota1 = 0;

        boolean isProm = true;
        for (int i = 0; i < x; i++) {
            System.out.println("Ingresa calificación :");
            calfscan = scanner.nextDouble();

            if(calfscan == 0 || calfscan > 7){
                System.out.println("Error , No puedes ingresar una calificación menor a 0 y mayor a 7");
                isProm = false;
                break;
            }else{

                if(calfscan ==1){
                    nota1 ++;
                }

                if (calfscan > 5) {
                    notamenor5 ++;
                }

                if(calfscan <4){
                    notamenor4 ++;
                }
            }

            calificaciones[i] =calfscan;
        }

        //Realizamos ahora el calculo para el promedio
        if(isProm){
            double calsum = 0;
            double promedioTotal = 0;

            System.out.println("calificaciones length :" +calificaciones.length);
            for (int j = 0; j< calificaciones.length; j++) {
                System.out.println("calif: " + calificaciones[j]);

                calsum += calificaciones[j];
            }

            promedioTotal = calsum/x;

            System.out.println("nota igual a 1 :" + nota1);
            System.out.println("notas mayors a 5 :" + notamenor5);
            System.out.println("notas menores de 4 :" + notamenor4);
            System.out.println("Promedio total :"+ promedioTotal);
        }
    }
}
