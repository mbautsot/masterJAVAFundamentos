package Operadores;

public class OperadorTernario {

    public static void main(String[] args) {

        /*TODO
            Los operadores ternarios en programación se refieren a una forma condensada y concisa de escribir una expresión condicional. Se les llama "ternarios" porque operan sobre tres operandos: una condición booleana, un valor que se devuelve si la condición es verdadera y otro valor que se devuelve si la condición es falsa.
            En muchos lenguajes de programación, incluido Java, el operador ternario toma la forma general:
            condicion ? valor_si_verdadero : valor_si_falso
         */

        String varible = 7 == 7?"Es verdadero":"Falso";
        System.out.println("variable :"+ varible);

        String estado = "";
        double promedio = 8.0;

        estado = promedio >= 5.0?"Estas aprobado":"Estas reprobado";
        System.out.println("Estado :" + estado);
    }
}
