package FlujoDeControl;

import java.util.ArrayList;

public class SentenciaForEach {
    public static void main(String[] args) {

        /*
            TODO
                foreach es una construcción en varios lenguajes de programación, incluido Java, que permite
                iterar de manera sencilla sobre elementos de una colección, como arreglos (arrays) o colecciones
                de datos (como listas o conjuntos). En Java, foreach es parte del enfoque más general de
                iteración conocido como "enhanced for loop" o "foreach loop".

                for (tipo elemento : colección) {
                // Código a ejecutar para cada elemento
                }
         */

            /*TODO
                ** tipo: Es el tipo de datos de los elementos en la colección. Por ejemplo, si estás recorriendo un arreglo de enteros (int[]), tipo sería int.
                ** elemento: Es una variable que representa cada elemento individual de la colección durante la iteración.
                ** colección: Es la colección de elementos sobre la cual se desea iterar, como un arreglo (int[], String[], etc.) o una colección que implemente la interfaz Iterable (por ejemplo, ArrayList, HashSet, etc.).
             */

            //Vamos a iterar un ArrayList

        ArrayList<String> nombres= new ArrayList<>();
        nombres.add("Sofia");
        nombres.add("Lilian");
        nombres.add("Nicolas");
        nombres.add("Santiago");
        nombres.add("Marcos");
        nombres.add("Loky");
        nombres.add("Drogon");

        for (String nombre : nombres) {
            System.out.println("integrantes Familia :"+ nombre);
        }

        /*TODO
            Características y consideraciones
               * Simplicidad: foreach simplifica el código al eliminar la necesidad de administrar un índice o un iterador manualmente.
               * Legibilidad: Mejora la legibilidad del código al enfocarse en lo que se hace con cada elemento en lugar de los detalles de la iteración.
               * Limitaciones: No permite modificar los elementos de la colección mientras se está iterando. Para tales casos, se deben utilizar métodos específicos y considerar el uso de iteradores convencionales.
                En resumen, foreach en Java es una herramienta poderosa y conveniente para iterar sobre colecciones de datos de manera simple y eficiente, facilitando el desarrollo de código claro y conciso.
         */


        int[] numeros = {3,4,5,6,7,8};

        for (int num:numeros) {
            System.out.println("numeros :" + num);
        }
    }
}
