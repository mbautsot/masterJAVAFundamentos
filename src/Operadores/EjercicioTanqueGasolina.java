package Operadores;

import java.util.Scanner;

public class EjercicioTanqueGasolina {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la medida actual del Tanque?");
        double litros = scan.nextDouble();

        System.out.println("Litros :"+litros);

      String statusTanque = litros==70?"Estanque lleno":"";

        statusTanque += litros>=60 && litros <=69?"Estanque casi lleno":"";
        statusTanque += litros>=40 && litros <=59?"Estanque  3/4":"";
        statusTanque += litros>=35 && litros <=39?"Medio Estanque ":"";
        statusTanque += litros>=20 && litros <=34?"Suficiente":"";
        statusTanque += litros>=1 && litros <=19?"Insuficiente":"";


        System.out.println(statusTanque);
    }
}
