package FlujoDeControl;

import java.util.Scanner;

public class MultiplicacionDosNumeros {
    public static void main(String[] args) {

        ///TODO Multiplicar dos numeros sin usar el simbolo de multiplicacion

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero :");
        int num1scan = scanner.nextInt();

        System.out.println("Ingresa segundo :");
        int num2scan = scanner.nextInt();

        int num1=0;
        int num2=0;

       if(num1scan < 0 ){
           num1=-num1scan;
       }else {
           num1 = num1scan;
       }

       if ( num2scan <0){
           num2=-num2scan;
       }else {
           num2 = num2scan;
       }

       int multiplicacion = 0;
        for (int i = 0; i < num2; i++) {
            multiplicacion+=num1;
        }

        if(num1scan < 0 || num2scan <0 ) {
            System.out.println("El resultado de la multiplicacion es :" + (-multiplicacion));
        }else {
            System.out.println("El resultado de la multiplicacion es :" + multiplicacion);
        }
    }
}
