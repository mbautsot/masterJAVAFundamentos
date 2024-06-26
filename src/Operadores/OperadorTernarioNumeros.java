package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int num1 = scan.nextInt();
        System.out.println("Ingresa segundo numero:");
        int num2 = scan.nextInt();
        System.out.println("Ingresa tercer numero:");
        int num3 = scan.nextInt();

        //TODO Si l numro 1 s mayor a el numero dos entonces es mayor num1 si no es num2
        int numMayor = num1 > num2?num1:num2;
        numMayor = numMayor>num3?numMayor:num3;

        System.out.println("El numero mayor es :"+ numMayor);
    }
}
