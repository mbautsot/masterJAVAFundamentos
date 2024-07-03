package FlujoDeControl;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioFlujoControl1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (i<10){
            System.out.println("Ingresa numero: ");
            numeros.add(scan.nextInt()); ///se agregan los numeros en este arreglo de enteros.
            i++;
        }

        System.out.println("tamaño de arreglo :" + numeros.size());

        int menor = numeros.get(0); ///Guardamos lo que se encuentra en la posicion 0 , indicando que es el numero menor
        int mayor = numeros.get(0);
        for (int j = 0; j < numeros.size(); j++) {
            //recorremos el arreglo validandolo con le numero menor
            if(numeros.get(j) < menor){
                ///asiganamos el nuevo valor a menor para indicar que es el mas pequeño
                menor = numeros.get(j);
            }

            if(numeros.get(j) > mayor){
                ///asiganamos el nuevo valor a menor para indicar que es el mas pequeño
                mayor = numeros.get(j);
            }

        }
        /*
        System.out.println("numero menor :"+ menor);
        System.out.println("numero mayor :"+ mayor);
        */
        if(menor == mayor){
            System.out.println("El numero menor es igual o mayor que "+ mayor);
        }else{
            System.out.println("El numero menor es menor que "+ mayor+"!");
        }
    }
}
