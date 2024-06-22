package Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*TODO
            Java proporciona muchos tipos de operadores que se pueden utilizar segun la necesidad
            , se clasifican segun la funcionalidad

            1.-Aritmeticos
            2.-Relacionales
            3.-Logicos
            4.-Asignacion

            UNARIOS - INCREMENTALES - TERNARIOS, COMBINADOS, DE BITS DE INSTANCIA.
         */

        int j=4, i=5;

        //La prioridad siempre es el parentesis.
        //Se lee de izquierda a derecha.

        System.out.println("suma :" + (j+i));

        System.out.println("suma :" + j+i); ///concatenara la cadena (54)
        System.out.println("resta :"+ (j-i));
        System.out.println("multiplicacion :"+ (j*i));
        System.out.println("division :"+ (i/j));

        System.out.println("division  reciduo :"+ Double.valueOf(i%j));




    }
}
