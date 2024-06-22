package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        //El operador de asignacion es (=)
        int num = 5;
        int num2 = 6;

        num += num2;//Esto es igual (5+6)
        System.out.println("suma += -->"+ num); ///11
        System.out.println("resta += -->" +  (num -= num2));//11-6 = 5
        System.out.println("multiplicacion *= -->" + (num*=num2));// 5*6 =30

        int num3 = 60;
        System.out.println("division /= -->" + (num/=num3));// 0
        System.out.println("division %= -->" + (num/=num3));// 0 residuo

    }
}
