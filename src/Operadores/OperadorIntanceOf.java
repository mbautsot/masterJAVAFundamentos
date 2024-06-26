package Operadores;

public class OperadorIntanceOf {
    public static void main(String[] args) {

        /*TODO
                El operador instanceof en Java se utiliza para comprobar si un objeto es una instancia de una clase específica o de una de sus subclases.
                Es una herramienta importante para garantizar la seguridad del tipo en tiempo de ejecución y evitar errores de tipo ClassCastException.
                   ** Ventajas
                    Seguridad en el tiempo de ejecución: Ayuda a evitar errores de tipo y ClassCastException.
                    Flexibilidad: Permite manejar diferentes tipos de objetos en una jerarquía de clases de manera segura.
        */

        String texto ="Es de tipo String";
        Integer num = 7;

        boolean instance = texto instanceof String;
        System.out.println("Texto es de la instancia String -> "+ instance);

        //TODO Todas la clases son instancias de OBJECT en java
        boolean instance2 = num instanceof Object;
        System.out.println(" Todos son object :"+ instance2);

        boolean instance3 = num instanceof Integer;
        System.out.println(" num es de la instancia Integer -> "+ instance3);


    }
}
