package Cadenas;

public class ManejoString {
    public static void main(String[] args) {
        //TODO los string son objetos de java, del tipo de referencia.
        String nombre = new String("MArcos");

        //TODO asi se declara de un forma mas comoda
        String nombrestr = "Marcos"; //solo entre comillas dobles

        //TODO  Para incluir comillas dobles se debe de escapar con \

        String cadena = " MArcos \"Bautista\"";
        System.out.println("-->" + cadena); //--> MArcos "Bautista"

        //TODO Los caracteres de un String se codifican usando UNICODE
        // LOS STRING SON INMUTABLES , regresa una nueva instanca de un nuevo string por lo tanto no cambia.
        // CONCATENAR : Para concatenar se utiliza el (+) , hay otro metodo concat.

        String cadenaConcat = "Marcos :" + "Bautista";
        System.out.println("concatenar (+) "+ cadenaConcat);
        String cadenaConcat2 = "Marcos".concat(" Bautista");

        System.out.println("concatenar metodo concat :"+ cadenaConcat2);

        /*TODO COMPARAR
                Los String no son PRIMITIVOS por lo tanto no se puden comparar con el operador relacional (==)
                va a comprar la referencia pero no el valor.
                *Se debe de comparar con equals()
         */

        String valor1 = "Hola Marcos";
        String valor2 = "Hola Marcos";

        //Compara si son el mismo objeto
        System.out.println("Comparacion objeto :"+valor1==valor2); ///False no son el mismo objeto.

        //Compara si tienen el mismo valor TODO FORMA CORRECTA
        System.out.println("comparar el valor :" + valor1.equals(valor2)); //True ya que tienen el mismo valor

        /*TODO
            Metodos :
            • int length() : número de caracteres
            • boolean equals(String b) : compara si ambas son iguales, por valor
            • boolean equalsIgnoreCase(String b) compara si ambas son iguales,
            independientemente de mayúsculas o minúsculas.
            • int compareTo(String b) Compara contra la cadena del argumento,
            devolviendo:
            • un valor negativo si la cadena es anterior a b
            • cero (0) si la cadena es igual a b
            • un valor positivo si la cadena es posterior a b
            • String trim() Crea un nuevo objeto eliminado el espacio en blanco que pudiera
            haber al principio o al final.
            • char charAt(int posicion) Extrae un carácter en la posición indicada.

             char[] toCharArray() Convierte la cadena en un arreglo de caracteres.
                • String substring(int a, int b) Extrae la sub-cadena entre las posiciones a y b.
                • String substring(int desde) Extrae la sub-cadena desde la posición indicada.
                • int indexOf(String cadena) Indican en qué posición se encuentra el carácter (o
                cadena) indicado por primera vez, buscando desde el principio.
                • int lastIndexOf(String cadena) Indica en qué posición se encuentra el carácter
                (o cadena) indicado por primera vez, buscando desde el final.
                • boolean startsWith(String prefijo) Dice si la cadena comienza con el prefijo
                indicado.
                • boolean endsWith(String sufijo) Dice si la cadena termina con el sufijo
                indicado.
                • String[] split(String patron) Divide la cadena en varias subcadenas utilizando
                el patrón indicado como separador.


         */

        String a = "HoLA";
        String b = "HOLA";

        String c = "HOLA   ";


        System.out.println("Numero de caracteres (length ):" + a.length());
        System.out.println("equals :" + a.equals(b));
        System.out.println("equalsIsIgnoreCase :" + a.equalsIgnoreCase(b));

        System.out.println("compareTo -: " + a.compareTo(b)); ///TODO b=HoLA -32
        System.out.println("compareTo +: " + a.compareTo(b)); ///TODO b=HOLA 32

        System.out.println("trim " + c.trim());

        System.out.println("charAt :" + a.charAt(2));//TODO L H=0,O=1,L=2,A=3

        System.out.println("char[]" + a.toCharArray());



    }
}
