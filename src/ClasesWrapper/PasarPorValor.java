package ClasesWrapper;

public class PasarPorValor {
    public static void main(String[] args) {

        /*
            TODO
                En Java, cuando se pasan variables primitivas como parámetros a métodos,
                se hace mediante una copia del valor de la variable original.
                Esto significa que cualquier modificación realizada dentro del método al parámetro
                no afectará a la variable original
                fuera del método. Esto se conoce como "paso por valor".
         */

        //TODO Variable i en main: Se declara e inicializa la variable i con el valor 10.
        int i = 10;


        System.out.println("Iniciamos el método main con i -->" + i);

        /*TODO Llamada a test(i):
           Se pasa una copia del valor de i (que es 10) al método test.
           Dentro de test, el parámetro i es una copia local que inicialmente tiene el valor 10.
        */
        test(i);

         /*TODO
            Impresiones en consola:
                En la salida del método main, verás que el valor de i sigue
                siendo 10 después de llamar a test, ya que la modificación
                hecha en test solo afecta a su copia local del parámetro i.
         */
        System.out.println("Finaliza el metodo main con el valor de i --> " +i);
    }

    public static void test(int i){

        /*TODO
            Modificación dentro de test:
            Dentro de test, se cambia el valor del parámetro i a 35.
            Esto modifica solo la copia local del parámetro i dentro de test, no afecta a la variable i original en main.
         */

        System.out.println("Iniciamos el metodo test -->" + i);
        i=35;
        System.out.println("Finaliza el metodo test con el valor de i --> " +i);

    }
}

/*TODO
    Conclusiones:
    Referencias y asignaciones: En Java, tanto para tipos primitivos como para objetos (Integer en este caso),
                                siempre se pasa una copia del valor de la referencia (o del objeto para tipos primitivos) a los métodos.
                                Esto significa que modificar la referencia dentro del método no afectará la referencia original fuera del método.

Inmutabilidad de Integer: Es importante recordar que los objetos Integer (y otros tipos envoltorio) son inmutables en Java. Esto significa que una vez que se crea un objeto Integer con un valor específico, no se puede modificar ese valor directamente. Cualquier operación que parezca modificar un Integer en realidad está creando un nuevo objeto Integer.

Por lo tanto, tanto con tipos primitivos como con tipos envoltorio (Integer), Java mantiene la misma semántica de "paso por valor". Si necesitas modificar el contenido de un objeto o la referencia que apunta a un objeto, deberías utilizar estructuras que permitan la modificación, como arrays o clases con métodos mutadores.
 */