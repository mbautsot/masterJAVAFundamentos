package Operadores;

public class OperacionesRelacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double  l = 2.1413e3;
        boolean  m = false;

        System.out.println( "validacion :" + (i==j)); ///Valida el valor pero esto es conveniente en los primitivos.
        boolean b1 = (i==j); ///SE UTILIZA PARA PRIMITIVOS ==

        boolean b2 = !b1; //Negacion lo contrario
        System.out.println("b2 :"+ b2);

        boolean b3 = i != j; //Distintos
        System.out.println("b3 :"+ b3);

        System.out.println("Mayor que  :" + (i > j));
        System.out.println("Menor que  :" + (i < j));

        //TODO el signo = simbre va de lado derecho
        System.out.println("Mayor Igual que  :" + (i >= j));
        System.out.println("Menor Igual que  :" + (i <= j));



    }
}
