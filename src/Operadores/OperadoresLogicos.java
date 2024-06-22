package Operadores;

import java.util.function.ToDoubleBiFunction;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double  l = 2.1413e3;
        boolean  m = false;

        /*TODO  con (&&) se evaluan las dos expresiones y estas deben de ser TRUE para que sea true
            En este caso k>l es false, por ello la expresion completa no se cumple.
        * */
        boolean b1 = i == j  && k > l;
        System.out.println(" b1 : "+ b1); //true

        /*TODO si SOLO UNA SE CUMPLE ES TRUE
            En este caso solo se cumple la primer expresion que es i == j , la siguiente no se cumple
            pero con (&) si una parte de la expresion se cumple es true
        * */
        boolean b2 = i == j  & k < l;
        System.out.println("b2 :"+ b2);

        /*TODO
            OR (||) Si solo una expresion es true toda la expresion es true
         */
        boolean b3= i == j ||  k < l;
        System.out.println("b3 :"+ b3);


        /*TODO
            Las expresiones se evaluan siempre de IzQUIERDA A DERECHA.
            O como una expresion matematica, agragando los parentesis se da prioridad.
         */

        boolean b4= i == j &&  k < l|| m == false;
        System.out.println("b4 :" + b4);


        boolean b5= i == j &&  (k < l || m == true);
        System.out.println("b5 :"+ b5);



    }
}
