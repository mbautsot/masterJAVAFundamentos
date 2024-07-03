package FlujoDeControl;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroMenorADiez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0;

        ArrayList<Integer> numeros = new ArrayList<>();
        while (i <10){

            System.out.println("Ingresa numero: ");
            numeros.add(scan.nextInt());

            i++;
        }

        int numeroMenor = 0;
        for (int j = 0; j < numeros.size(); j++) {
              if(numeros.get(j) <= 10){
                  numeroMenor = numeros.get(j);
              }
        }

       // System.out.println("numero menor :" + numeroMenor);
        if(numeroMenor == 10 ){
            System.out.println("El numero menor es igual o mayor que 10");
        }else {
            System.out.println("El numero menor es menor que 10!");
        }

    }
}
