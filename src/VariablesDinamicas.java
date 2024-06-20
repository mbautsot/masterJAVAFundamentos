public class VariablesDinamicas {
    public static void main(String[] args) {

        /*TODO En Java, a partir de la versión 10, se introdujo la palabra reservada var, que permite la inferencia de tipos en variables locales. Esto significa
           que el compilador deduce el tipo de la variable a partir del valor que se le asigna.
           (Son de tipo primitivo)

           Aunque var puede hacer que el código parezca más dinámico, en realidad, el tipo de la variable sigue siendo estático y se determina en tiempo de compilación.


        * */
        var nombre = "Marcos"; //String
        var edad = 38; ///int
        var altura = 172.0; ///double
        var esEstudiante = true; // boolean

        /*
        En este ejemplo:edad, altura y esEstudiante son variables de tipos primitivos (int, double y boolean respectivamente).
        Mientras: nombre, lista y mapa son variables de tipos de referencia (String, ArrayList<String> y HashMap<String, Integer> respectivamente).
         */

        var lista = new java.util.ArrayList<String>(); // ArrayList<String>
        var mapa = new java.util.HashMap<String, Integer>(); // HashMap<String, Integer>

        System.out.println("tipo variable nombre :"+ nombre);
        System.out.println("Tipo variale edad:" + edad);
        System.out.println("Tipo variable altura :" + altura);


        System.out.println("Tipo de nombre: " + nombre.getClass().getSimpleName());
        System.out.println("Tipo de lista: " + lista.getClass().getSimpleName());
        System.out.println("Tipo de mapa: " + mapa.getClass().getSimpleName());


        System.out.println("Tipo de edad: " + ((Object) edad).getClass().getSimpleName());
        System.out.println("Tipo de altura: " + ((Object) altura).getClass().getSimpleName());
        System.out.println("Tipo de esEstudiante: " + ((Object) esEstudiante).getClass().getSimpleName());
        System.out.println("Tipo de nombre: " + nombre.getClass().getSimpleName());
        System.out.println("Tipo de lista: " + lista.getClass().getSimpleName());
        System.out.println("Tipo de mapa: " + mapa.getClass().getSimpleName());


        /*TODO No necesariamente. Las variables declaradas con var pueden ser de tipos primitivos
         o de tipos de referencia (objetos). El tipo inferido depende del valor asignado a la variable en el momento de la declaración. Aquí hay algunos ejemplos que ilustran ambos casos:
         */


    }
}
