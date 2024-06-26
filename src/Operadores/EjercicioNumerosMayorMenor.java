package Operadores;

import java.util.Scanner;

public class EjercicioNumerosMayorMenor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = scan.nextInt();
        System.out.println("Ingresa segundo numero");
        int num2 = scan.nextInt();

        int numMax = num1>num2?num1:num2;
        int numMin = num1 < num2 ? num1 : num2; ///ESto es adicional


        System.out.println("Los numeros de mayor a menor son:" + numMax +","+(numMax==num1?num2:num1));
    }
}
